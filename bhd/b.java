package bhd.b;
import n3d.a;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oe6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import tkd.b;
import tkd.d;
import wu5.a;
import ihc.a;

public final class b implements a	// class@000262
{
    public final BindPhoneItem b;

    public void b(BindPhoneItem p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(a.f()) && !PermissionUtils.a(a.B, "android.permission.READ_CONTACTS")) {
          d.a(0x6de3c81e).Eo(this.b.b, true, 9);
       }
       return;
    }
}
