package com.plattysoft.leonids.ParticleField;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.util.ArrayList;
import java.lang.Object;
import ik8.a;

public class ParticleField extends View	// class@000b4c
{
    public ArrayList b;

    public void ParticleField(Context p0){
       super(p0);
    }
    public void ParticleField(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ParticleField(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       ParticleField tb = this.b;
       _monitor_enter(tb);
       for (int i = 0; i < this.b.size(); i = i + 1) {
          this.b.get(i).a(p0);
       }
       _monitor_exit(tb);
       return;
    }
    public void setParticles(ArrayList p0){
       this.b = p0;
    }
}
