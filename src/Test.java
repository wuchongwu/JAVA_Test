import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 伍崇武
 * @date 2022-12-26 0026 - 上午 10:14:20
 */
public class Test {
    public static void main(String[] args) {
        Entity entity1 = new Entity();
        entity1.setId("1");
        entity1.setParentId("-1");
        entity1.setName("主管");
        Entity entity2 = new Entity();
        entity2.setId("2");
        entity2.setParentId("1");
        entity2.setName("主管1");
        Entity entity21 = new Entity();
        entity21.setId("21");
        entity21.setParentId("2");
        entity21.setCode("a");
        entity21.setName("主管11");
        Entity entity3 = new Entity();
        entity3.setId("3");
        entity3.setParentId("1");
//        entity3.setCode("b");
        entity3.setName("主管2");
        Entity entity4 = new Entity();
        entity4.setId("4");
        entity4.setParentId("-1");
        entity4.setName("经理");
        Entity entity5 = new Entity();
        entity5.setId("5");
        entity5.setParentId("4");
        entity5.setCode("c");
        entity5.setName("经理1");
        Entity entity6 = new Entity();
        entity6.setId("6");
        entity6.setParentId("4");
        entity6.setCode("d");
        entity6.setName("经理2");
        Entity entity7 = new Entity();
        entity7.setId("7");
        entity7.setParentId("-1");
        entity7.setName("前台");
        Entity entity8 = new Entity();
        entity8.setId("8");
        entity8.setParentId("7");
        entity8.setCode("e");
        entity8.setName("前台1");
        Entity entity9 = new Entity();
        entity9.setId("9");
        entity9.setParentId("-1");
        entity9.setName("其他");
        ArrayList<Entity> entities = new ArrayList<>();
        entities.add(entity1);
        entities.add(entity2);
        entities.add(entity3);
        entities.add(entity4);
        entities.add(entity5);
        entities.add(entity6);
        entities.add(entity7);
        entities.add(entity8);
//        entities.add(entity9);
        entities.add(entity21);


        // 构造树形结构
        List<Entity> res = buildListTree(entities);
        List<Entity> remove = remove(res);

    }
    public static List<Entity> remove(List<Entity> entityList) {
        if (entityList == null) {
            return null;
        }
        Iterator<Entity> iterator = entityList.iterator();
        while (iterator.hasNext()) {
            Entity next = iterator.next();
            String code = next.getCode();
            List<Entity> childList = next.getChildList();
            if (code == null && childList == null) {
                iterator.remove();
            } else {
                remove(childList);
            }
        }
        return entityList;
    }

    public static List<Entity> buildListTree (List<Entity> entityList) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("e");

        // 如果为空直接返回空数据
        if (entityList.size() == 0) {
            return entityList;
        }
//        for (int i = entityList.size() - 1; i >= 0; i--) {
//            Entity entity = entityList.get(i);
//            if (entity.getCode() != null && !list1.contains(entity.getCode())) {
//                entityList.remove(i);
//            }
//        }
        // 转为树结构
        Map<String, List<Entity>> pidListMap =
                entityList.stream()
                        // 把过滤父类id为空的数据
//                        .filter(entity -> {
//                            if (entity.getCode() == null) {
//                                return;
//                            }
//                            if (list1.contains(entity.getCode())) {
//                                return ;
//                            }
//                        })
                        // 根据父级id进行分组
                        .collect(Collectors.groupingBy(Entity::getParentId));
        // 拿到的 pidListMap 的key是父级id， value是当前父级下的所有子级
        entityList.forEach(goodsTypeDTO -> {
            // 把子级设置到父级中去
            goodsTypeDTO.setChildList(pidListMap.get(goodsTypeDTO.getId()));
        });
        // 只返回顶级节点的数据即可
        return pidListMap.get("-1");
    }
}
