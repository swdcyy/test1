package fqb.a;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioNotificationStatus;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class a	// class@0029be
{
    public MusicRadioNotificationStatus a;
    public long b;
    public String c;

    public void a(MusicRadioNotificationStatus p0,long p1,String p2){
       a.p(p0, "musicRadioPlayStatus");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(MusicRadioNotificationStatus p0,long p1,String p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 0;
       }
       super(p0, p1, null);
       return;
    }
    public final String a(){
       return this.c;
    }
}
