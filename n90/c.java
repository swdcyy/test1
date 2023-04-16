package n90.c;
import n3d.a;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import u80.e;
import java.lang.String;
import q87.c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import w46.b;
import com.yxcorp.gifshow.models.QMedia;
import android.app.Activity;

public final class c implements a	// class@0026d0
{
    public final KSPostAlbumProcessActivity b;

    public void c(KSPostAlbumProcessActivity p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KSPostAlbumProcessActivity", "KuaiShanSegmentEditActivity callback", objArray);
       if (p0 == 101) {
          p0 = -1;
          if (p1 == p0 && p2 != null) {
             Intent intent = new Intent();
             String str = "INTENT_KEY_CROP_TRANSFORM";
             Serializable serializable = SerializableHook.getSerializableExtra(p2, str);
             if (serializable == null) {
                Object[] objArray2 = new Object[i];
                e.D().t("KSPostAlbumProcessActivity", "KuaiShanSegmentEditActivity callback transform is null", objArray2);
             }else {
                SerializableHook.putExtra(intent, str, serializable);
             }
             Serializable serializable1 = SerializableHook.getSerializableExtra(p2, "intent_key_qmedia");
             if (serializable1 instanceof QMedia) {
                SerializableHook.putExtra(intent, "intent_key_qmedia", serializable1);
             }
             tb.setResult(p0, intent);
             tb.finish();
          label_005c :
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       e.D().t("KSPostAlbumProcessActivity", "KuaiShanSegmentEditActivity callback invalid", objArray1);
       goto label_005c ;
    }
}
