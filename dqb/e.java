package dqb.e;
import qm9.a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger$MusicRadioBtnType;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import android.app.Activity;
import ypb.a;
import zpb.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.music.radio.backplay.MusicRadioPlayModel;
import dqb.d;
import java.lang.Enum;
import kob.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.entity.QPhoto;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView;

public final class e extends a	// class@0024f2
{
    public a r;
    public Context s;

    public void e(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
          return;
       }
       MusicRadioLogger.f(null, MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_MODEL.getType(), 0, 4, null);
       e ts = this.s;
       if (ts instanceof Activity) {
          objArray = ts;
       }
       if (objArray != null) {
          a uoa = a.a(objArray);
          if (uoa != null) {
             MusicRadioPlayModel value = uoa.r0().getValue();
             if (value != null) {
                int i = d.b[value.ordinal()];
                if (i != 1) {
                   if (i == 2) {
                      uoa.r0().setValue(MusicRadioPlayModel.LIST);
                      h.c(0);
                      this.f();
                   }
                }else {
                   uoa.r0().setValue(MusicRadioPlayModel.SINGLE);
                   h.c(1);
                   this.i();
                }
             }
             uoa.r0().setValue(MusicRadioPlayModel.RANDOM);
             h.c(2);
             this.h();
          }
       }
       return;
    }
    public void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "1")) {
          return;
       }
       e ts = this.s;
       if (ts instanceof Activity) {
          objArray = ts;
       }
       if (objArray != null) {
          a uoa = a.a(objArray);
          if (uoa != null) {
             MutableLiveData mutableLiveD = uoa.r0();
             if (mutableLiveD != null) {
                MusicRadioPlayModel value = mutableLiveD.getValue();
                if (value != null) {
                   int i = d.a[value.ordinal()];
                   if (i != 1) {
                      if (i != 2) {
                         if (i == 3) {
                            this.i();
                         }
                      }else {
                         this.h();
                      }
                   }else {
                      this.f();
                   }
                }
             }
          }
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.m();
       e tr = this.r;
       if (tr != null) {
          tr.k0();
       }
       return;
    }
    public void m(){
       e tr;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "2")) {
          return;
       }
       e ts = this.s;
       if (ts instanceof Activity) {
          tr = ts;
       }
       if (objArray != null) {
          a uoa = a.a(objArray);
          if (uoa != null) {
             QPhoto qPhoto = uoa.p0();
             if (qPhoto != null) {
                tr = this.r;
                if (tr != null) {
                   this.n(tr.P0(qPhoto));
                }
             }
          }
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       RecyclerView recyclerView = this.j();
       if (recyclerView != null) {
          recyclerView.setAdapter(this.r);
       }
       return;
    }
}
