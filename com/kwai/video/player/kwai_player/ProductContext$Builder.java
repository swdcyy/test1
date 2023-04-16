package com.kwai.video.player.kwai_player.ProductContext$Builder;
import java.lang.Object;
import com.kwai.video.player.kwai_player.ProductContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.kwai_player.ProductContext$1;

public class ProductContext$Builder	// class@000b4d
{
    public String bizType;
    public int playIndex;

    public void ProductContext$Builder(){
       super();
       this.bizType = "N/A";
       this.playIndex = -1;
    }
    public ProductContext build(){
       Object obj = PatchProxy.apply(null, this, ProductContext$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProductContext(this, null);
    }
    public ProductContext$Builder setBizType(String p0){
       this.bizType = p0;
       return this;
    }
    public ProductContext$Builder setPlayIndex(int p0){
       this.playIndex = p0;
       return this;
    }
}
