package epb.a;
import com.kwai.feature.component.searchhistory.d;
import epb.a$a;
import nsd.u;
import g06.e;
import epb.a$b;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.music.cloudmusic.search.history.MusicSearchHistoryData;
import com.kwai.feature.component.searchhistory.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import lnc.a1;
import com.kwai.feature.component.searchhistory.a$e;
import ml8.c;
import epb.c;
import com.kwai.feature.component.searchhistory.a$b;
import epb.b;
import com.kwai.feature.component.searchhistory.a$a;

public class a extends d	// class@0027a3
{
    public MusicSearchUiOption F;
    public final a$a G;
    public static final a$a H;

    static {
       a.H = new a$a(null);
    }
    public void a(e p0){
       super(p0);
       this.G = new a$b(this);
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a tF = this.F;
       if (tF != null && (tF.getHasHistoryTopEntrance() == true && p0 != null)) {
          p0.add(0, new MusicSearchHistoryData(true));
       }
    label_0021 :
       super.W0(p0);
       return;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0 && this.N0(p0) instanceof MusicSearchHistoryData) {
          return 10;
       }else {
          return super.f0(p0);
       }
    }
    public f h1(ViewGroup p0,int p1){
       View view;
       a tF;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       this.v1();
       if (p1 != 2) {
          if (p1 != 10) {
             view = a.i(p0, R.layout.arg_RES_7f0d13c0);
             a.o(view, "KwaiLayoutInflater.infla¡­t.search_history_item_v1\)");
             tF = this.F;
             if (tF != null) {
                a.m(tF);
                if (MusicSearchUiOption.Companion.a(tF.getMainColorId())) {
                   tF = this.F;
                   a.m(tF);
                   view.setBackgroundColor(a1.a(tF.getMainColorId()));
                }
             }
             return new f(view, new a$e(this));
          }else {
             return new f(a.i(p0, 0x7f0d1022), new c(this.F));
          }
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d01af);
          a.o(view, "KwaiLayoutInflater.infla¡­ayout.clear_history_item\)");
          tF = this.F;
          if (tF != null) {
             a.m(tF);
             if (MusicSearchUiOption.Companion.a(tF.getMainColorId())) {
                tF = this.F;
                a.m(tF);
                view.setBackgroundColor(a1.a(tF.getMainColorId()));
             }
          }
          b uob = PatchProxy.apply(null, this, uoa, "3");
          if (uob != patchProxyRe) {
          }else {
             uob = new b(this);
          }
          return new f(view, uob);
       }
    }
    public a$a r1(){
       return this.G;
    }
}
