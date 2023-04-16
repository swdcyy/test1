package com.yxcorp.gifshow.common_music_player.a;
import im8.g;
import g9c.a;
import qm9.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.common_music_player.MusicPlayerAdapterAccessor;
import java.util.Map;
import java.util.HashMap;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Integer;
import y8c.f$b;
import ml8.c;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sm9.f;

public class a extends a implements g	// class@001191
{
    public h g;

    public void a(){
       super();
       this.g = new h();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new MusicPlayerAdapterAccessor();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new MusicPlayerAdapterAccessor());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          p0.d.b = p1;
          Object[] objArray = new Object[]{this.N0(p1),this.g,p0.d};
          p0.b.i(objArray);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f uof;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uof != PatchProxyResult.class) {
          label_0033 :
             return uof;
          }
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new f());
       uof = new f(a.i(p0, 0x7f0d1014), presenterV2);
       goto label_0033 ;
    }
}
