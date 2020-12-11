/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ public class EntityTNTPrimed
        /*    */   extends Entity
        /*    */ {
    /* 11 */   public int a = 0;
    /*    */
    /*    */   public EntityTNTPrimed(World paramdp) {
        /* 14 */     super(paramdp);
        /* 15 */     this.d = true;
        /* 16 */     a(0.98F, 0.98F);
        /* 17 */     this.yOffset = this.D / 2.0F;
        /*    */   }
    /*    */
    /*    */   public EntityTNTPrimed(World paramdp, float paramFloat1, float paramFloat2, float paramFloat3) {
        /* 21 */     this(paramdp);
        /*    */
        /* 23 */     a(paramFloat1, paramFloat2, paramFloat3);
        /*    */
        /* 25 */     float f = (float)(Math.random() * 3.1415927410125732D * 2.0D);
        /* 26 */     this.motionX = (-MathHelper.a(f * 3.1415927F / 180.0F) * 0.02F);
        /* 27 */     this.motionY = 0.20000000298023224D;
        /* 28 */     this.motionZ = (-MathHelper.b(f * 3.1415927F / 180.0F) * 0.02F);
        /*    */
        /* 30 */     this.G = false;
        /* 31 */     this.a = 80;
        /*    */
        /* 33 */     this.h = paramFloat1;
        /* 34 */     this.i = paramFloat2;
        /* 35 */     this.j = paramFloat3;
        /*    */   }
    /*    */
    /*    */   public boolean c_() {
        /* 39 */     return !this.isDead;
        /*    */   }
    /*    */
    /*    */   public void onUpdate() {
        /* 43 */     this.h = this.posX;
        /* 44 */     this.i = this.posY;
        /* 45 */     this.j = this.posZ;
        /*    */
        /* 47 */     this.motionY -= 0.03999999910593033D;
        /* 48 */     moveEntity(this.motionX, this.motionY, this.motionZ);
        /* 49 */     this.motionX *= 0.9800000190734863D;
        /* 50 */     this.motionY *= 0.9800000190734863D;
        /* 51 */     this.motionZ *= 0.9800000190734863D;
        /*    */
        /* 53 */     if (this.onGround) {
            /* 54 */       this.motionX *= 0.699999988079071D;
            /* 55 */       this.motionZ *= 0.699999988079071D;
            /* 56 */       this.motionY *= -0.5D;
            /*    */     }
        /*    */
        /* 59 */     if (this.a-- <= 0) {
            /* 60 */       setEntityDead();
            /* 61 */       b();
            /*    */     } else {
            /* 63 */       this.worldObj.a("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            /*    */     }
        /*    */   }
    /*    */
    /*    */
    /*    */   private void b() {
        /* 69 */     float f = 4.0F;
        /* 70 */     this.worldObj.a((Entity)null, this.posX, this.posY, this.posZ, f);
        /*    */   }
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */
    /*    */   protected void writeEntityToNBT(NBTTagCompound paramr) {
        /* 85 */     paramr.a("Fuse", (byte)this.a);
        /*    */   }
    /*    */
    /*    */   protected void readEntityFromNBT(NBTTagCompound paramr) {
        /* 89 */     this.a = paramr.b("Fuse");
        /*    */   }
    /*    */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */