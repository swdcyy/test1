package hn8.f;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;

public class f	// class@0025bd
{

    public static int[] a(ReadableArray p0){
       int i = p0.size();
       int[] ointArray = new int[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ointArray[i1] = p0.getInt(i1);
       }
       return ointArray;
    }
    public static Map b(ReadableMap p0){
       ReadableMapKeySetIterator readableMapK = p0.keySetIterator();
       HashMap hashMap = new HashMap();
       while (readableMapK.hasNextKey()) {
          String str = readableMapK.nextKey();
          hashMap.put(str, Integer.valueOf(p0.getInt(str)));
       }
       return hashMap;
    }
}
