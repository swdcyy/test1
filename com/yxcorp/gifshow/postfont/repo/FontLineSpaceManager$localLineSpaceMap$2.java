package com.yxcorp.gifshow.postfont.repo.FontLineSpaceManager$localLineSpaceMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Map;

public final class FontLineSpaceManager$localLineSpaceMap$2 extends Lambda implements a	// class@0010a2
{
    public static final FontLineSpaceManager$localLineSpaceMap$2 INSTANCE;

    static {
       FontLineSpaceManager$localLineSpaceMap$2.INSTANCE = new FontLineSpaceManager$localLineSpaceMap$2();
    }
    public void FontLineSpaceManager$localLineSpaceMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       HashMap obj = PatchProxy.apply(null, this, FontLineSpaceManager$localLineSpaceMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("SourceHanSansCN-Bold.otf", Integer.valueOf(33));
       obj.put("001xinqingnian.otf", Integer.valueOf(13));
       obj.put("002tianniu.ttf", Integer.valueOf(35));
       obj.put("003haibao.TTC", Integer.valueOf(35));
       obj.put("004xiangjiaoren.ttf", Integer.valueOf(35));
       obj.put("005zongyi.TTF", Integer.valueOf(24));
       obj.put("006hanyihei.ttf", Integer.valueOf(20));
       obj.put("007pop3.TTC", Integer.valueOf(35));
       obj.put("009yansong.ttf", Integer.valueOf(14));
       obj.put("008pinyin.ttf", Integer.valueOf(4));
       obj.put("010lvdou.ttf", Integer.valueOf(-20));
       obj.put("011xique.ttf", Integer.valueOf(14));
       obj.put("012kaiti.ttf", Integer.valueOf(27));
       return obj;
    }
}
