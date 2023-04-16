package be.a;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.lang.String;

public class a	// class@000b1c
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       a.a = hashMap;
       hashMap.put("View", "RCTView");
       hashMap.put("Image", "RCTImageView");
       hashMap.put("ScrollView", "RCTScrollView");
       hashMap.put("Slider", "RCTSlider");
       hashMap.put("ModalHostView", "RCTModalHostView");
       hashMap.put("Paragraph", "RCTText");
       hashMap.put("Text", "RCText");
       hashMap.put("RawText", "RCTRawText");
       hashMap.put("ActivityIndicatorView", "AndroidProgressBar");
       hashMap.put("ShimmeringView", "RKShimmeringView");
       hashMap.put("TemplateView", "RCTTemplateView");
       hashMap.put("AxialGradientView", "RCTAxialGradientView");
       hashMap.put("Video", "RCTVideo");
       hashMap.put("StickerInputView", "RCTStickerInputView");
       hashMap.put("Map", "RCTMap");
    }
    public static String a(String p0){
       String str = a.a.get(p0);
       if (str != null) {
          p0 = str;
       }
       return p0;
    }
}
