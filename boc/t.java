package boc.t;
import erd.o;
import java.lang.String;
import java.lang.Object;
import wkd.b;
import boc.h;
import com.yxcorp.gifshow.util.resource.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import boc.b0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.yxcorp.gifshow.util.resource.IncrementalUtils$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import qfc.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import brd.t;
import cjd.e;

public final class t implements o	// class@00044f
{
    public final String b;
    public final String c;

    public void t(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       t tb = this.b;
       t tc = this.c;
       h oh = b.a(-1625817566);
       String str = "";
       HashMap hashMap = new HashMap();
       Iterator iterator = e.a.iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          MagicModel magicModel = MagicEmojiResourceHelper.i(str1);
          if (magicModel != null) {
             String str2 = b0.d(str1);
             if (!TextUtils.x(str2)) {
                String str3 = str2.replace(magicModel.getResourceDir(), str);
                if (!TextUtils.x(str3)) {
                   hashMap.put(str1, str3);
                }
             }
          }
       }
       if (!hashMap.isEmpty()) {
          String str4 = a.a.r(hashMap, new IncrementalUtils$1().getType());
          Object[] objArray = new Object[0];
          a.C().w("IncrementalUtils", "localVersionJson : "+str4, objArray);
          str = str4;
       }
       return oh.a(tb, tc, p0, str).map(new e());
    }
}
