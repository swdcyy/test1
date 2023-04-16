package e19.c$a;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import e19.c;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;

public class c$a implements IMediaPlayer$OnCompletionListener	// class@00211d
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onCompletion(IMediaPlayer p0){
       p0.w = true;
    }
}
