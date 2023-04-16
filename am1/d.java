package am1.d;
import yh3.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import wl1.j;
import wl1.h;
import ah1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

public final class d extends a	// class@0000df
{
    public final LiveData a;
    public final LiveGiftPanelConfig b;
    public final j c;
    public final h d;
    public final c e;

    public void d(LiveGiftPanelConfig p0,j p1,h p2,c p3){
       a.p(p0, "panelConfig");
       a.p(p1, "tabListModel");
       a.p(p2, "selectTabModel");
       a.p(p3, "showTabModel");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
    }
    public final LiveData u0(){
       return this.a;
    }
}
