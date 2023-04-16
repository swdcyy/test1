package f03.c;
import com.kuaishou.livestream.message.nano.LiveEffectResourceData;
import java.lang.Object;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public class c	// class@00282e
{
    public String a;
    public int b;
    public int c;
    public CDNUrl[] d;
    public LiveEffectImageConfig e;
    public String f;
    public String localPath;

    public void c(LiveEffectResourceData p0){
       super();
       this.a = p0.position;
       this.d = e0.i(p0.cdnUrl);
       this.e = p0.imageConfig;
       this.b = p0.resType;
       this.f = p0.resourceId;
       this.c = p0.downloadSource;
    }
}
