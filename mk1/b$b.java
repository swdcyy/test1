package mk1.b$b;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.gift.audience.UiMode;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;

public class b$b	// class@003196
{
    public UserInfo a;
    public UserInfo b;
    public boolean c;
    public ClientContentWrapper$LiveVoicePartyPackage d;
    public int e;
    public int f;
    public UiMode g;
    public int h;
    public int i;
    public GiftTab j;
    public Map k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;

    public void b$b(UserInfo p0,UserInfo p1){
       super();
       this.e = -1;
       this.f = -1;
       this.g = UiMode.NormalMode;
       this.h = 0;
       this.j = GiftTab.NormalGift;
       this.p = "other";
       this.b = p0;
       this.a = p1;
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public b$b b(boolean p0){
       this.c = p0;
       return this;
    }
    public b$b c(Map p0){
       this.k = p0;
       return this;
    }
    public b$b d(GiftTab p0){
       this.j = p0;
       return this;
    }
    public b$b e(ClientContentWrapper$LiveVoicePartyPackage p0){
       this.d = p0;
       return this;
    }
    public b$b f(String p0){
       this.l = p0;
       return this;
    }
    public b$b g(int p0){
       this.e = p0;
       this.f = -1;
       return this;
    }
    public b$b h(int p0){
       this.h = p0;
       return this;
    }
    public b$b i(UiMode p0){
       this.g = p0;
       return this;
    }
}
