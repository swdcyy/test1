package com.yxcorp.gifshow.camera.record.photo.p$a;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.camera.record.photo.p;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class p$a extends d	// class@000ef5
{
    public final File y;
    public final p z;

    public void p$a(p p0,FragmentActivity p1,File p2){
       this.z = p0;
       this.y = p2;
       super(p1);
    }
    public Object b(Object[] p0){
       Void void = PatchProxy.applyOneRefs(p0, this, p$a.class, "1");
       if (void != PatchProxyResult.class) {
       }else {
          void = this.z.p(this.y);
       }
       return void;
    }
}
