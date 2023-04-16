package com.kuaishou.common.encryption.model.FansTopPrepayParam$a;
import com.kuaishou.common.encryption.model.a$a;
import com.kuaishou.common.encryption.model.FansTopPrepayParam;
import com.kuaishou.common.encryption.model.a;
import java.lang.String;
import com.kuaishou.common.encryption.model.AbstractPrepayParam;

public class FansTopPrepayParam$a extends a$a	// class@0016be
{

    public void FansTopPrepayParam$a(){
       super(new FansTopPrepayParam());
    }
    public FansTopPrepayParam$a b(long p0){
       this.a.clientTimestamp = p0;
       return this;
    }
    public FansTopPrepayParam$a c(String p0){
       this.a.data = p0;
       return this;
    }
    public FansTopPrepayParam$a d(long p0){
       this.a.exploreCostFen = p0;
       return this;
    }
    public FansTopPrepayParam$a e(long p0){
       this.a.setFen(p0);
       return this;
    }
    public FansTopPrepayParam$a f(long p0){
       this.a.followCostFen = p0;
       return this;
    }
    public FansTopPrepayParam$a g(long p0){
       this.a.nearbyCostFen = p0;
       return this;
    }
    public FansTopPrepayParam$a h(long p0){
       this.a.photoId = p0;
       return this;
    }
    public FansTopPrepayParam$a i(int p0){
       this.a.provider = p0;
       return this;
    }
    public FansTopPrepayParam$a j(long p0){
       this.a.seqId = p0;
       return this;
    }
    public FansTopPrepayParam$a k(long p0){
       this.a.visitorId = p0;
       return this;
    }
}
