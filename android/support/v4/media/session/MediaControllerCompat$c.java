package android.support.v4.media.session.MediaControllerCompat$c;
import androidx.media.AudioAttributesCompat$a;
import androidx.media.AudioAttributesCompat;
import java.lang.Object;

public final class MediaControllerCompat$c	// class@0003e6
{
    public final int a;
    public final AudioAttributesCompat b;
    public final int c;
    public final int d;
    public final int e;

    public void MediaControllerCompat$c(int p0,int p1,int p2,int p3,int p4){
       AudioAttributesCompat$a uoa = new AudioAttributesCompat$a();
       uoa.b(p1);
       super(p0, uoa.a(), p2, p3, p4);
    }
    public void MediaControllerCompat$c(int p0,AudioAttributesCompat p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
}
