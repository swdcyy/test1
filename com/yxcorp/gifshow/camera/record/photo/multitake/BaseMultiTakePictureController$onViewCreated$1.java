package com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$onViewCreated$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$onViewCreated$1$a;
import android.view.View$OnClickListener;
import hg9.l;
import oa0.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.camera.record.base.d;
import ig9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.Objects;
import java.lang.Boolean;
import android.widget.TextView;
import java.lang.CharSequence;

public final class BaseMultiTakePictureController$onViewCreated$1 extends Lambda implements l	// class@000ebc
{
    public final BaseMultiTakePictureController this$0;

    public void BaseMultiTakePictureController$onViewCreated$1(BaseMultiTakePictureController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final l1 invoke(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l obj = PatchProxy.applyOneRefs(p0, this, BaseMultiTakePictureController$onViewCreated$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          p0.setOnClickListener(new BaseMultiTakePictureController$onViewCreated$1$a(this));
       }
       boolean b = true;
       p0 = this.this$0.l2().a(b);
       if (p0 != null) {
          p0.setSelected(a.a.getBoolean("enableMultiTakePicture", false));
          if (p0.isSelected()) {
             this.this$0.d.m(new a(b));
          }
       }
       l ol = this.this$0.l2();
       Objects.requireNonNull(ol);
       obj = l.class;
       if (PatchProxy.isSupport(obj)) {
          obj = PatchProxy.applyOneRefs(Boolean.TRUE, ol, obj, "5");
          if (obj != patchProxyRe) {
          label_006b :
             if (obj != null) {
                String str = this.this$0.i2();
                if (str != null) {
                   obj.setText(str);
                }
             }
             return null;
          }
       }
       if (ol.e == null) {
          ol.c();
       }
       obj = ol.e;
       goto label_006b ;
    }
}
