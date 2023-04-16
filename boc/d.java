package boc.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.resource.FontCategory;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.util.resource.FontCategory$b;
import java.util.Map;
import java.io.File;
import java.lang.String;
import qfc.a;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.google.gson.Gson;
import qkd.c;
import java.lang.Throwable;

public final class d implements Runnable	// class@00043f
{
    public final FontCategory b;

    public void d(FontCategory p0){
       this.b = p0;
    }
    public final void run(){
       int i;
       d tb = this.b;
       Objects.requireNonNull(tb);
       try{
          i = 0;
          FontCategory mFontDownloa = tb.mFontDownloadInfo;
          mFontDownloa.f = mFontDownloa.e;
          Map map = FontCategory.parseFontIdCache();
          FontCategory mFontDownloa1 = tb.mFontDownloadInfo;
          map.put(mFontDownloa1.d, mFontDownloa1.f);
          File uFile = new File(FontCategory.getFontResDir(), "font_config");
          if (!uFile.exists()) {
             Object[] objArray1 = new Object[i];
             a.C().s("FontCategory", "markHaveDownloaded newFile: "+uFile.createNewFile(), objArray1);
          }
          c.v(uFile.getAbsolutePath(), a.a.q(map), i);
       }catch(java.io.IOException e0){
          Object[] objArray = new Object[i];
          a.C().u("FontCategory", e0, objArray);
       }
       return;
    }
}
