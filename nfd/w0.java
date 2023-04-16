package nfd.w0;
import erd.g;
import android.app.Activity;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import um6.j;
import java.lang.String;
import com.kuaishou.android.model.music.MusicType;

public final class w0 implements g	// class@001e1b
{
    public final Activity b;
    public final Music c;

    public void w0(Activity p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       w0 tc = this.c;
       p0.Oh(this.b, tc.mId, tc.mType);
    }
}
