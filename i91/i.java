package i91.i;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import s81.a;
import android.content.SharedPreferences;
import java.util.Iterator;

public final class i	// class@002863
{
    public int a;
    public static final SoundEffectItem b;
    public static final SoundEffectItem c;
    public static final SoundEffectItem d;
    public static final SoundEffectItem e;
    public static final SoundEffectItem f;
    public static final SoundEffectItem g;
    public static final SoundEffectItem h;
    public static final SoundEffectItem i;
    public static final SoundEffectItem j;
    public static final List k;

    static {
       SoundEffectItem soundEffectI = new SoundEffectItem(0x7f1039a6, 0x7f08130f, 0, 1);
       i.b = soundEffectI;
       SoundEffectItem soundEffectI1 = new SoundEffectItem(0x7f101b1e, 0x7f080f61, 12, 9);
       i.c = soundEffectI1;
       SoundEffectItem soundEffectI2 = new SoundEffectItem(0x7f101b37, 0x7f080f64, 4, 11);
       i.d = soundEffectI2;
       SoundEffectItem soundEffectI3 = new SoundEffectItem(0x7f104a48, 0x7f080f63, 6, 3);
       i.e = soundEffectI3;
       i.f = new SoundEffectItem(0x7f101b38, 0x7f080f66, 7, 13);
       SoundEffectItem soundEffectI4 = new SoundEffectItem(0x7f104a4a, 0x7f080f65, 9, 2);
       i.g = soundEffectI4;
       SoundEffectItem soundEffectI5 = new SoundEffectItem(0x7f101b1d, 0x7f0818b1, 1, 8);
       i.h = soundEffectI5;
       SoundEffectItem soundEffectI6 = new SoundEffectItem(0x7f101b21, 0x7f0818b2, 2, 15);
       i.i = soundEffectI6;
       SoundEffectItem soundEffectI7 = new SoundEffectItem(0x7f101b28, 0x7f0818b3, 13, 16);
       i.j = soundEffectI7;
       SoundEffectItem[] soundEffectI8 = new SoundEffectItem[]{soundEffectI,soundEffectI7,soundEffectI6,soundEffectI4,soundEffectI1,soundEffectI2,soundEffectI3,soundEffectI5};
       i.k = Arrays.asList(soundEffectI8);
    }
    public void i(){
       super();
    }
    public static SoundEffectItem a(){
       SoundEffectItem soundEffectI;
       Object obj = PatchProxy.apply(null, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int intx = a.a.getInt("live_ktv_current_select_reverb_level", 0);
       Iterator iterator = i.k.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return i.b;
          }
          soundEffectI = iterator.next();
          if (soundEffectI.mReverbLevel == intx) {
             break ;
          }
       }
       return soundEffectI;
    }
}
