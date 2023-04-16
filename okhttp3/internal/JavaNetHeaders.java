package okhttp3.internal.JavaNetHeaders;
import okhttp3.internal.JavaNetHeaders$1;
import java.lang.Object;
import okhttp3.Headers;
import java.lang.String;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

public final class JavaNetHeaders	// class@001f6d
{
    public static final Comparator FIELD_NAME_COMPARATOR;

    static {
       JavaNetHeaders.FIELD_NAME_COMPARATOR = new JavaNetHeaders$1();
    }
    public void JavaNetHeaders(){
       super();
    }
    public static Map toMultimap(Headers p0,String p1){
       TreeMap treeMap = new TreeMap(JavaNetHeaders.FIELD_NAME_COMPARATOR);
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          String str = p0.name(i1);
          String str1 = p0.value(i1);
          ArrayList uArrayList = new ArrayList();
          List list = treeMap.get(str);
          if (list != null) {
             uArrayList.addAll(list);
          }
          uArrayList.add(str1);
          treeMap.put(str, Collections.unmodifiableList(uArrayList));
       }
       if (p1 != null) {
          treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(p1)));
       }
       return Collections.unmodifiableMap(treeMap);
    }
}
