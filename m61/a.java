package m61.a;
import com.kuaishou.live.bottombar.component.panel.a;
import androidx.lifecycle.LifecycleOwner;
import k61.f;
import android.view.ViewGroup;
import k61.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.bottombar.component.panel.settting.a;
import m61.b;
import m61.c;
import java.lang.Number;
import java.util.List;
import ekd.q;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import k61.g;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarSettingItem;

public class a extends a	// class@003129
{

    public void a(LifecycleOwner p0,f p1){
       super(p0, p1);
    }
    public c J0(ViewGroup p0,int p1){
       View view;
       a uoa1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0x7f0d0a86;
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 != 5) {
                   if (p1 != 6) {
                      view = a.i(p0, R.layout.arg_RES_7f0d0a87);
                      view.findViewById(R.id.live_bottom_bar_divider).setVisibility(0);
                      uoa1 = new a(view, this.h);
                   }else {
                      view = a.i(p0, R.layout.arg_RES_7f0d0a85);
                      view.findViewById(R.id.live_bottom_bar_divider).setVisibility(0);
                      uoa1 = new b(view, this.h);
                   }
                }else {
                   view = a.i(p0, R.layout.arg_RES_7f0d0a85);
                   view.findViewById(R.id.live_bottom_bar_divider).setVisibility(8);
                   uoa1 = new b(view, this.h);
                }
             }else {
                view = a.i(p0, R.layout.arg_RES_7f0d0a87);
                view.findViewById(R.id.live_bottom_bar_divider).setVisibility(8);
                uoa1 = new a(view, this.h);
             }
          }else {
             view = a.i(p0, i);
             view.findViewById(R.id.live_bottom_bar_divider).setVisibility(0);
             uoa1 = new c(view);
          }
       }else {
          view = a.i(p0, i);
          view.findViewById(R.id.live_bottom_bar_divider).setVisibility(8);
          uoa1 = new c(view);
       }
       return uoa1;
    }
    public int f0(int p0){
       MutableLiveData obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = q.d(this.f, p0);
       int i = 0;
       if (obj != null && obj.getValue() != null) {
          if (obj.getValue() instanceof g) {
             if (!p0) {
                return 1;
             }else {
                return 2;
             }
          }else if(obj.getValue() instanceof LiveBottomBarSettingItem){
             MutableLiveData mutableLiveD = q.d(this.f, (p0 + 1));
             if (mutableLiveD == null || (mutableLiveD.getValue() == null || !mutableLiveD.getValue() instanceof g)) {
                i = 1;
             }
             if (obj.getValue().mButtonType == 2) {
                if (i) {
                   return 6;
                }else {
                   return 5;
                }
             }else if(obj.getValue().mButtonType == 1){
                if (i) {
                   return 4;
                }else {
                   return 3;
                }
             }else {
                return obj.getValue().mButtonType;
             }
          }
       }
       return i;
    }
}
