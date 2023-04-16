package com.yxcorp.plugin.setting.stencil.item.FontItem;
import ihc.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.FontItem$action$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import ihc.a;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public final class FontItem extends c	// class@000916
{
    public final l s;

    public void FontItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.s = new FontItem$action$1(this);
    }
    public l getAction(){
       return this.s;
    }
    public void o(){
       float[] a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FontItem.class, "1")) {
          return;
       }
       MutableLiveData status = this.getStatus();
       a tb = this.b;
       String str = PatchProxy.applyOneRefs(tb, objArray, FontScaleHelper.class, "6");
       if (str != PatchProxyResult.class) {
       }else {
          a.p(tb, "context");
          if (FontScaleHelper.e()) {
             str = tb.getString(R.string.arg_RES_7f101045);
             a.o(str, "context.getString\(R.stri¡­font_scale_follow_system\)");
          }else {
             float f = FontScaleHelper.c();
             a = FontScaleHelper.a;
             int len = a.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   int i1 = (!a[i] - f)? 1: 0;
                   if (i1) {
                   label_0057 :
                      if (i >= 0) {
                         int[] b = FontScaleHelper.b;
                         if (i <= (b.length - 1)) {
                            str = tb.getString(b[i]);
                            a.o(str, "context.getString\(fontScaleNameArray[index]\)");
                            break ;
                         }
                      }
                      str = "";
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_0057 ;
                }
             }
          }
       }
       status.setValue(str);
       return;
    }
}
