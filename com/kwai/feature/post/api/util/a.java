package com.kwai.feature.post.api.util.a;
import erd.a;
import java.util.List;
import android.app.Activity;
import java.util.Map;
import java.lang.Object;
import com.kwai.feature.post.api.util.PostPermissionUtils;
import java.util.Iterator;
import com.kwai.feature.post.api.util.PostPermission;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Iterable;
import java.lang.Class;
import qk.y;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u07.t$a;
import q46.h;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class a implements a	// class@00145d
{
    public final List b;
    public final Activity c;
    public final boolean d;
    public final Map e;

    public void a(List p0,Activity p1,boolean p2,Map p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       String str1;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       PostPermissionUtils.a();
       PostPermissionUtils.f();
       Iterator iterator = this.b.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          i = i & PermissionUtils.a(tc, iterator.next().mName);
       }
       if (!i && td != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator1 = te.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry = iterator1.next();
             if (!uEntry.getValue().booleanValue() && !PermissionUtils.l(tc, uEntry.getKey())) {
                uArrayList.add(uEntry.getKey());
             }
          }
          if (uArrayList.size() > 0) {
             String[] stringArray = y.v(uArrayList, String.class);
             PostPermissionUtils postPermissi = PostPermissionUtils.class;
             if (!PatchProxy.applyVoidTwoRefs(tc, stringArray, null, postPermissi, "8")) {
                StringBuilder str = "";
                int len = stringArray.length;
                int i1 = 0;
                while (i1 < len) {
                   object oobject = stringArray[i1];
                   if (!PermissionUtils.a(tc, oobject)) {
                      Resources resources = tc.getResources();
                      Object obj = PatchProxy.applyOneRefs(oobject, null, postPermissi, "10");
                      int i2 = -1;
                      if (obj != PatchProxyResult.class) {
                         i2 = obj.intValue();
                      }else {
                         Objects.requireNonNull(oobject);
                         PatchProxyResult patchProxyRe = 2;
                         switch (oobject.hashCode()){
                             case 0xe7cc5230:
                               if (!oobject.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                               label_00e3 :
                                  str1 = -1;
                               }else {
                                  str1 = null;
                               }
                               break;
                             case 0x1b9efa65:
                               if (!oobject.equals("android.permission.CAMERA")) {
                                  goto label_00e3 ;
                               }else {
                                  str1 = 1;
                               }
                               break;
                             case 0x516a29a7:
                               if (!oobject.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                  goto label_00e3 ;
                               }else {
                                  str1 = 2;
                               }
                               break;
                             case 0x6d24f988:
                               if (!oobject.equals("android.permission.RECORD_AUDIO")) {
                                  goto label_00e3 ;
                               }else {
                                  str1 = 3;
                               }
                               break;
                             default:
                               goto label_00e3 ;
                         }
                         if (str1) {
                            if (str1 != 1) {
                               if (str1 != patchProxyRe) {
                                  if (str1 == 3) {
                                     i2 = 0x7f103dd2;
                                  }
                               }
                            }else {
                               i2 = 0x7f1042a8;
                            }
                         }
                         i2 = 0x7f103dd0;
                      }
                      str = str+resources.getString(i2)+10;
                   }
                   i1 = i1 + 1;
                }
                if (str.length()) {
                   str.deleteCharAt((str.length() - 1));
                }
                String str2 = str;
                if (!PatchProxy.applyVoidTwoRefs(tc, str2, null, postPermissi, "9") && !TextUtils.x(str2)) {
                   t$a uoa = new t$a(tc);
                   uoa.z0(str2);
                   uoa.S0(R.string.arg_RES_7f10471b);
                   uoa.Q0(R.string.arg_RES_7f103bd1);
                   uoa.u0(new h(tc));
                   uoa.v(1);
                   f.e(uoa).Y(PopupInterface.a);
                }
             }
          }
       }
       return;
    }
}
