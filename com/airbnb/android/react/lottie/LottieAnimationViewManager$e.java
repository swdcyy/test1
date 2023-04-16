package com.airbnb.android.react.lottie.LottieAnimationViewManager$e;
import wc.c;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import androidx.collection.LruCache;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import com.airbnb.lottie.LottieAnimationView;
import kb.c;
import v4.g;
import v4.d;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import android.util.Base64;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Map;

public class LottieAnimationViewManager$e extends c	// class@000d81
{
    public final LruCache a;
    public final String b;
    public final ReadableArray c;
    public final LottieAnimationView d;
    public final LottieAnimationViewManager e;

    public void LottieAnimationViewManager$e(LottieAnimationViewManager p0,LruCache p1,String p2,ReadableArray p3,LottieAnimationView p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onFailureImpl(c p0){
       int i = 0;
       if (g.e() && this.e.getOrCreatePropertyManager(this.d).d() != null) {
          this.e.getOrCreatePropertyManager(this.d).d().put("imageLoadResult", Integer.valueOf(i));
          this.e.getOrCreatePropertyManager(this.d).d().put("imageLoadError", "imageError:bundle image preload failed");
       }
       byte[] uobyteArray = Base64.decode(("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAAXNSR0IArs4c6QAAAFBlWElmTU0AKgAAAAgAAgESAAMAAAABAAEAAIdpAAQAAAABAAAAJgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAAAaADAAQAAAABAAAAAQAAAADr/7PgAAABWWlUWHRYTUw6Y29tLmFkb2JlLnhtcAAAAAAAPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iWE1QIENvcmUgNi4wLjAiPgogICA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgogICAgICA8cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0iIgogICAgICAgICAgICB4bWxuczp0aWZmPSJodHRwOi8vbnMuYWRvYmUuY29tL3RpZmYvMS4wLyI+CiAgICAgICAgIDx0aWZmOk9yaWVudGF0aW9uPjE8L3RpZmY6T3JpZW50YXRpb24+CiAgICAgIDwvcmRmOkRlc2NyaXB0aW9uPgogICA8L3JkZjpSREY+CjwveDp4bXBtZXRhPgoZXuEHAAAAC0lEQVQIHWNgAAIAAAUAAY27m/MAAAAASUVORK5CYII=").substring(22), i);
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inScaled = true;
       options.inDensity = 160;
       this.a.put(this.b, BitmapFactory.decodeByteArray(uobyteArray, i, uobyteArray.length, options));
       if (this.a.size() == this.c.size()) {
          this.e.getOrCreatePropertyManager(this.d).l(this.a.snapshot());
       }
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       this.a.put(this.b, LottieAnimationViewManager.copyNewBitmap(p0));
       if (this.a.size() == this.c.size()) {
          this.e.getOrCreatePropertyManager(this.d).l(this.a.snapshot());
          this.e.onAssetsImagesReady(this.d);
          if (g.e() && this.e.getOrCreatePropertyManager(this.d).d() != null) {
             this.e.getOrCreatePropertyManager(this.d).d().put("imageLoadResult", Integer.valueOf(1));
          }
       }
       return;
    }
}
