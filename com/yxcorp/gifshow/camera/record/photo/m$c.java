package com.yxcorp.gifshow.camera.record.photo.m$c;
import com.kwai.horae.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.kuaishou.gifshow.files.a;

public class m$c extends b	// class@000eb6
{

    public void m$c(){
       super();
    }
    public String a(){
       return "generate_new_dcim_image_file";
    }
    public Object b(){
       File uFile = PatchProxy.apply(null, this, m$c.class, "1");
       if (uFile != PatchProxyResult.class) {
       }else {
          uFile = a.c();
       }
       return uFile;
    }
}
