package boc.k;
import java.util.concurrent.CopyOnWriteArraySet;
import lnc.s6;
import o56.c;
import o56.a;
import xf6.g;
import java.lang.String;
import xf6.l;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.util.Set;
import com.yxcorp.gifshow.util.resource.Category;
import java.util.List;
import com.yxcorp.gifshow.util.resource.p;
import java.util.ArrayList;
import java.util.Iterator;
import boc.b;
import java.io.File;
import j80.f;
import ekd.j;
import ekd.k1;

public class k	// class@000446
{
    public static final Set a;
    public static final long b;

    static {
       int i1;
       CopyOnWriteArraySet uCopyOnWrite = new CopyOnWriteArraySet();
       k.a = uCopyOnWrite;
       int i = 0;
       if (a.a().c()) {
          i1 = -1;
          if (g.o1()) {
             i1 = l.e("KEY_MODEL_UN_DELETEABLE_PERIOD", i1);
          }
          if (i1 >= 0) {
          label_002c :
             k.b = (long)(((i1 * 24) * 60) * 60) * 1000;
             String str = a.t().c("unsupportCleanModelList", "");
             Object[] objArray = new Object[i];
             a.C().w("ResourceCacheUtils", "server config : "+str, objArray);
             if (!TextUtils.x(str) && (str.startsWith("[") && str.endsWith("]"))) {
                String[] stringArray = (str.substring(1, (str.length() - 1))).split(",");
                int len = stringArray.length;
                i1 = 0;
                while (i1 < len) {
                   MagicModel magicModel = MagicEmojiResourceHelper.i(stringArray[i1]);
                   if (magicModel != null) {
                      k.a.add(magicModel.getResourceDir());
                   }
                   i1 = i1 + 1;
                }
             }else {
                uCopyOnWrite.add(Category.MAGIC_YCNN_RICKON_DRL_CC.getResourceDir());
                uCopyOnWrite.add(Category.MAGIC_YCNN_PLAYER_MP4_ABR.getResourceDir());
                uCopyOnWrite.add(Category.MAGIC_YCNN_PLAYER_HLS_ABR.getResourceDir());
             }
             Iterator iterator = p.c().iterator();
             while (iterator.hasNext()) {
                k.a.add(iterator.next().getResourceDir());
             }
             Object[] objArray1 = new Object[i];
             a.C().w("ResourceCacheUtils", "safeTime : "+k.b+", "+k.a.size(), objArray1);
          }
       }
       i1 = f.f("undeletablePeriod", i);
       goto label_002c ;
    }
    public static long a(){
       Iterator iterator = k.b().iterator();
       long l = 0;
       while (iterator.hasNext()) {
          l = l + f.c(iterator.next());
       }
       return l;
    }
    public static List b(){
       ArrayList uArrayList = new ArrayList();
       if (k.b <= 0) {
          return uArrayList;
       }
       File uFile = new File(MagicEmojiResourceHelper.g());
       if (uFile.exists() && uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles();
          if (j.h(uFileArray)) {
             return uArrayList;
          }else {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (!oobject.isDirectory() || (MagicEmojiResourceHelper.i(oobject.getName()) == null || (!k.a.contains(oobject.getAbsolutePath()) && k1.t(oobject.lastModified()) - k.b > 0))) {
                   uArrayList.add(oobject);
                }
             label_0065 :
                i = i + 1;
             }
          }
       }
       return uArrayList;
    }
}
