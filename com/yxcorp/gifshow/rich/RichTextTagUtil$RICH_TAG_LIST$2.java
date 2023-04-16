package com.yxcorp.gifshow.rich.RichTextTagUtil$RICH_TAG_LIST$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.rich.RichTextTagUtil;
import afa.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class RichTextTagUtil$RICH_TAG_LIST$2 extends Lambda implements a	// class@001b19
{
    public static final RichTextTagUtil$RICH_TAG_LIST$2 INSTANCE;

    static {
       RichTextTagUtil$RICH_TAG_LIST$2.INSTANCE = new RichTextTagUtil$RICH_TAG_LIST$2();
    }
    public void RichTextTagUtil$RICH_TAG_LIST$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, RichTextTagUtil$RICH_TAG_LIST$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RichTextTagUtil.a;
       String str = a.a.getString("richTextTagList", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
}
