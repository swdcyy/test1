package id9.j;
import java.lang.Runnable;
import id9.t;
import android.content.Intent;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import vf9.f0;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.lang.String;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.camera.record.base.b;

public final class j implements Runnable	// class@0027f0
{
    public final t b;
    public final Intent c;

    public void j(t p0,Intent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j oj = this;
       j b = oj.b;
       f0 uof0 = v14;
       f0 uof01 = v14;
       uof0 = new f0(MusicSource.DEFAULT, b.q, oj.c.getStringExtra("source_photo_origin_file"), 0, 0, false, b.r, 0, false, null);
       b.d.m(uof01);
    }
}
