package com.yxcorp.gifshow.entity.QPhoto$a;
import hkd.d;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;

public class QPhoto$a extends d	// class@000d6c
{
    public final QPhoto b;

    public void QPhoto$a(QPhoto p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, QPhoto$a.class, "1")) {
          return;
       }
       u1.R("find_photo_extmeta_is_null", a.a.q(this.b.mEntity), 5);
       return;
    }
}
