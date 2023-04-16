package aed.d;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.page.SoundTrackRenameActivity;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class d implements g	// class@000101
{
    public final SoundTrackRenameActivity b;
    public final String c;

    public void d(SoundTrackRenameActivity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       p0 = new Intent();
       p0.putExtra("soundtrack_name", this.c);
       tb.setResult(-1, p0);
       tb.finish();
    }
}
