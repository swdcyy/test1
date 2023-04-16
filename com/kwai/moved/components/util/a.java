package com.kwai.moved.components.util.a;
import erd.g;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import zq8.a;
import com.kwai.moved.components.util.KsAlbumPermissionUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.content.Context;
import java.util.List;
import java.lang.StringBuilder;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u07.t$a;
import ac7.a;
import u07.u;
import u07.t;
import u07.j;

public final class a implements g	// class@000f66
{
    public final Activity b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public void a(Activity p0,boolean p1,boolean p2,boolean p3,String p4,boolean p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void accept(Object p0){
       int i3;
       KsAlbumPermissionUtils ksAlbumPermi = KsAlbumPermissionUtils.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a tb = this.b;
          a tc = this.c;
          a td = this.d;
          if (!PatchProxy.isSupport(ksAlbumPermi) || !PatchProxy.applyVoidThreeRefs(tb, Boolean.valueOf(tc), Boolean.valueOf(td), null, KsAlbumPermissionUtils.class, "6")) {
             if (tc != null) {
                KsAlbumPermissionUtils.c(tb, KsAlbumPermissionUtils.a, 0x7883);
             }
             if (td != null) {
                KsAlbumPermissionUtils.c(tb, KsAlbumPermissionUtils.b, 0x7914);
             }
          }
          if (this.e != null && p0.b == null) {
             boolean b = KsAlbumPermissionUtils.f(this.b, this.f);
             if (this.g == null && !b) {
                tb = this.b;
                int i = 1;
                String[] stringArray = new String[i];
                stringArray[0] = p0.a;
                p0 = null;
                if (!PatchProxy.applyVoidTwoRefs(tb, stringArray, p0, ksAlbumPermi, "8")) {
                   StringBuilder str = "";
                   int i1 = 0;
                   while (i1 < i) {
                      object oobject = stringArray[i1];
                      if (!KsAlbumPermissionUtils.a(tb, oobject)) {
                         Resources resources = tb.getResources();
                         Object obj = PatchProxy.applyOneRefs(oobject, p0, ksAlbumPermi, "15");
                         int i2 = -1;
                         if (obj != PatchProxyResult.class) {
                            i2 = obj.intValue();
                         }else {
                            Objects.requireNonNull(oobject);
                            switch (oobject.hashCode()){
                                case 0x8f6e743f:
                                  if (!oobject.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                  label_00fb :
                                     i3 = -1;
                                  }else {
                                     i3 = 0;
                                  }
                                  break;
                                case 0xe7cc5230:
                                  if (!oobject.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                     goto label_00fb ;
                                  }else {
                                     i3 = 1;
                                  }
                                  break;
                                case 0xfc3e53aa:
                                  if (!oobject.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                     goto label_00fb ;
                                  }else {
                                     i3 = 2;
                                  }
                                  break;
                                case 0xffaaf457:
                                  if (!oobject.equals("android.permission.READ_PHONE_STATE")) {
                                     goto label_00fb ;
                                  }else {
                                     i3 = 3;
                                  }
                                  break;
                                case 0x1b9efa65:
                                  if (!oobject.equals("android.permission.CAMERA")) {
                                     goto label_00fb ;
                                  }else {
                                     i3 = 4;
                                  }
                                  break;
                                case 0x516a29a7:
                                  if (!oobject.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                     goto label_00fb ;
                                  }else {
                                     i3 = 5;
                                  }
                                  break;
                                case 0x6d24f988:
                                  if (!oobject.equals("android.permission.RECORD_AUDIO")) {
                                     goto label_00fb ;
                                  }else {
                                     i3 = 6;
                                  }
                                  break;
                                case 0x75dd2d9c:
                                  if (!oobject.equals("android.permission.READ_CONTACTS")) {
                                     goto label_00fb ;
                                  }else {
                                     i3 = 7;
                                  }
                                  break;
                                default:
                                  goto label_00fb ;
                            }
                            switch (i3){
                                case 0:
                                case 2:
                                  i2 = 0x7f1018c7;
                                  break;
                                case 1:
                                case 5:
                                  i2 = 0x7f1018c6;
                                  break;
                                case 3:
                                  i2 = 0x7f1018c9;
                                  break;
                                case 4:
                                  i2 = 0x7f1018c5;
                                  break;
                                case 6:
                                  i2 = 0x7f1018ca;
                                  break;
                                case 7:
                                  i2 = 0x7f1018c8;
                                  break;
                                default:
                            }
                         }
                         str = str+resources.getString(i2)+10;
                      }
                      i1 = i1 + 1;
                   }
                   if (str.length()) {
                      str.deleteCharAt((str.length() - i));
                   }
                   String str1 = str;
                   if (!PatchProxy.applyVoidTwoRefs(tb, str1, p0, ksAlbumPermi, "9") && !TextUtils.x(str1)) {
                      p0 = new t$a(tb);
                      p0.X0(str1);
                      p0.S0(R.string.arg_RES_7f1018b0);
                      p0.Q0(R.string.arg_RES_7f101896);
                      p0.u0(new a(tb));
                      j.d(p0);
                   }
                }
             }
          }
       }
    label_0168 :
       return;
    }
}
