package com.yxcorp.gifshow.video.b$e;
import com.yxcorp.gifshow.video.c$g;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class b$e implements c$g	// class@00168f
{
    public EditorSdk2$EditorSdkError a;

    public void b$e(EditorSdk2$EditorSdkError p0){
       super();
       this.a = p0;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, b$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.code();
    }
    public String message(){
       Object obj = PatchProxy.apply(null, this, b$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.message();
    }
}
