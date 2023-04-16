package ce9.f0;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.util.HashMap;
import java.lang.Float;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class f0 implements g	// class@0005bf
{
    public final l b;

    public void f0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.entrySet().iterator();
       while (p0.hasNext()) {
          Map$Entry uEntry = p0.next();
          String key = uEntry.getKey();
          Map map = tb.t.get(key);
          if (map == null || (map.get(MagicEmoji$SeekBarType.MAKEUP) == null && map.get(MagicEmoji$SeekBarType.SLIMMING) == null)) {
             HashMap hashMap = new HashMap();
             hashMap.put(MagicEmoji$SeekBarType.SLIMMING, uEntry.getValue());
             hashMap.put(MagicEmoji$SeekBarType.MAKEUP, uEntry.getValue());
             tb.t.put(key, hashMap);
          }
       }
       p0 = tb.i();
       if (p0 != null) {
          tb.r(p0);
       }
       return;
    }
}
