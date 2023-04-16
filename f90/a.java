package f90.a;
import n3d.a;
import com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaSceneAlbumActivity;
import android.os.Bundle;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.io.File;

public final class a implements a	// class@001fd9
{
    public final MediaSceneAlbumActivity b;
    public final Bundle c;

    public void a(MediaSceneAlbumActivity p0,Bundle p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "1")) {
          return;
       }
       if (p0 == 200) {
          int i = 2;
          if (p1 == -1) {
             String str = this.c.getString("KEY_CROPPED_IMAGE_PATH");
             if (str == null || !new File(str).isFile()) {
                MediaSceneAlbumActivity.A3(this.b, false, null, i, null);
                return;
             }else {
                this.b.z3(true, str);
             }
          }else if(p1){
             MediaSceneAlbumActivity.A3(this.b, false, null, i, null);
          }
       }
       return;
    }
}
