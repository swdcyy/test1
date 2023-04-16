package com.kuaishou.common.encryption.model.AbstractPrepayParam;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;

public abstract class AbstractPrepayParam extends a implements Serializable	// class@0016a7
{
    public long fen;
    public int provider;

    public void AbstractPrepayParam(){
       super();
    }
    public long getFen(){
       return this.fen;
    }
    public int getProvider(){
       return this.provider;
    }
    public void setFen(long p0){
       this.fen = p0;
    }
    public void setProvider(int p0){
       this.provider = p0;
    }
}
