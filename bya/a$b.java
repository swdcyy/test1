package bya.a$b;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import bya.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import bya.a$a;

public class a$b	// class@000489
{
    public String a;
    public boolean b;
    public Context c;
    public boolean d;
    public IMediaPlayer$OnErrorListener e;
    public IMediaPlayer$OnPreparedListener f;
    public IMediaPlayer$OnVideoSizeChangedListener g;
    public AwesomeCacheCallback h;
    public IMediaPlayer$OnInfoListener i;
    public IMediaPlayer$OnCompletionListener j;

    public void a$b(String p0,Context p1){
       super();
       this.b = false;
       this.d = true;
       this.a = p0;
       this.c = p1;
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.a)) {
          i1.c(new RuntimeException("PostKwaiMediaPlayer failed to build media player, wrong source"));
          return null;
       }else {
          a uoa = new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
          return obj;
       }
    }
    public a$b b(boolean p0){
       this.d = p0;
       return this;
    }
    public a$b c(AwesomeCacheCallback p0){
       this.h = p0;
       return this;
    }
    public a$b d(boolean p0){
       this.b = p0;
       return this;
    }
    public a$b e(IMediaPlayer$OnErrorListener p0){
       this.e = p0;
       return this;
    }
    public a$b f(IMediaPlayer$OnInfoListener p0){
       this.i = p0;
       return this;
    }
    public a$b g(IMediaPlayer$OnPreparedListener p0){
       this.f = p0;
       return this;
    }
    public a$b h(IMediaPlayer$OnVideoSizeChangedListener p0){
       this.g = p0;
       return this;
    }
}
