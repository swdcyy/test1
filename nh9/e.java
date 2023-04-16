package nh9.e;
import java.lang.Runnable;
import java.util.List;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import x8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.util.Iterator;
import boc.b;
import java.io.File;
import qkd.b;
import java.lang.CharSequence;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.util.resource.n;

public final class e implements Runnable	// class@003187
{
    public final List b;

    public void e(List p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       Object[] objArray = new Object[0];
       a.D().w("ResourceRestoreHelper", "startDownloadCategory "+tb, objArray);
       Iterator iterator = tb.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          File uFile = new File(uob.getResourceDir());
          String str = "missing ";
          if (uFile.exists()) {
             b.q(uFile);
             spannableStr.append(" "+uob.getResourceName());
             Object[] objArray1 = new Object[0];
             a.D().E("ResourceRestoreHelper", "[yModel][keypath][restore] ", str+uob.getResourceName(), objArray1);
             MagicEmojiResourceHelper.v(uob.getResourceName(), 0);
             n.l(uob);
          }else {
             objArray = new Object[0];
             a.D().E("ResourceRestoreHelper", "[yModel][keypath][restore] ", str+uob.getResourceName()+" 模型本身就不存在，缺失回调不进行重下载。", objArray);
          }
       }
       return;
    }
}
