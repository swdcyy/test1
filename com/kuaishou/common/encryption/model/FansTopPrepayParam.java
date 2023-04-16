package com.kuaishou.common.encryption.model.FansTopPrepayParam;
import t00.a;
import t00.b;
import com.kuaishou.common.encryption.model.AbstractPrepayParam;
import com.kuaishou.common.encryption.model.FansTopPrepayParam$a;
import java.lang.String;

public class FansTopPrepayParam extends AbstractPrepayParam implements a, b	// class@0016bf
{
    public String data;
    public long decryptionPhotoId;
    public long exploreCostFen;
    public long followCostFen;
    public long nearbyCostFen;
    public long photoId;

    public void FansTopPrepayParam(){
       super();
    }
    public static FansTopPrepayParam$a newBuilder(){
       return new FansTopPrepayParam$a();
    }
    public String getData(){
       return this.data;
    }
    public long getDecryptionPhotoId(){
       return this.decryptionPhotoId;
    }
    public long getExploreCostFen(){
       return this.exploreCostFen;
    }
    public long getFollowCostFen(){
       return this.followCostFen;
    }
    public long getNearbyCostFen(){
       return this.nearbyCostFen;
    }
    public long getPhotoId(){
       return this.photoId;
    }
    public void setData(String p0){
       this.data = p0;
    }
    public void setDecryptionPhotoId(long p0){
       this.decryptionPhotoId = p0;
    }
    public void setExploreCostFen(long p0){
       this.exploreCostFen = p0;
    }
    public void setFollowCostFen(long p0){
       this.followCostFen = p0;
    }
    public void setNearbyCostFen(long p0){
       this.nearbyCostFen = p0;
    }
    public void setPhotoId(long p0){
       this.photoId = p0;
    }
}
