package aed.i;
import aed.h;
import q3d.a;
import android.content.Context;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n3d.b;
import android.content.Intent;
import android.os.Parcelable;
import org.parceler.b;

public class i extends a implements h	// class@000106
{

    public void i(){
       super();
    }
    public final h j(Context p0,Music p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       obj.a = p0;
       obj.e = new Intent();
       this.b.e.setClassName(p0, "com.yxcorp.plugin.search.result.hashtag.page.SoundTrackRenameActivity");
       this.b.e.putExtra("soundtrack", b.c(p1));
       this.h0();
       return this;
    }
}
