import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> map= new HashMap<>();

        map.put("aaa", new ArrayList<>(List.of(10, 5, 2)));
        map.put("BB", new ArrayList<>(List.of(10, 5, 2)));
        map.get("aaa").add(5);
        map.computeIfAbsent("BB", key -> new ArrayList<>()).add(10);
        map.computeIfAbsent("ccc", key -> new ArrayList<>()).add(20);
        map.computeIfAbsent("ccc", key -> new ArrayList<>()).add(30);
        map.computeIfAbsent("aaa", key -> new ArrayList<>()).add(40);
        System.out.println(map);

    }
}