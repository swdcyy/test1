package com.smile.gifshow.annotation.provider.v2.Accessor;
import im8.f;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.Accessor$NotImplementedException;

public abstract class Accessor implements f	// class@000c46
{
    public f b;

    public void Accessor(){
       super();
    }
    public f a(){
       return this.b;
    }
    public void b(f p0){
       this.b = p0;
    }
    public void set(Object p0){
       throw new Accessor$NotImplementedException();
    }
}
