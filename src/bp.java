/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bp
/*     */   extends db
/*     */ {
/*  15 */   private int ac = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   public int a = 0;
/*     */   private int ad;
/*     */   private int ae;
/*     */   private int af;
/*     */   public fx b;
/*     */   
/*     */   public bp(dp paramdp) {
/*  58 */     super(paramdp);
/*  59 */     this.B = 0.0F;
/*  60 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public bp(dp paramdp, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  64 */     this(paramdp);
/*  65 */     this.ad = paramInt1;
/*  66 */     this.ae = paramInt2;
/*  67 */     this.af = paramInt3;
/*     */     
/*  69 */     ArrayList<fx> arrayList = new ArrayList();
/*  70 */     for (fx fx1 : fx.values()) {
/*  71 */       this.b = fx1;
/*  72 */       a(paramInt4);
/*  73 */       if (b()) {
/*  74 */         arrayList.add(fx1);
/*     */       }
/*     */     } 
/*  77 */     if (arrayList.size() > 0) {
/*  78 */       this.b = arrayList.get(this.Q.nextInt(arrayList.size()));
/*     */     }
/*  80 */     a(paramInt4);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  84 */     this.a = paramInt;
/*  85 */     this.s = this.q = (paramInt * 90);
/*     */     
/*  87 */     float f1 = this.b.u;
/*  88 */     float f2 = this.b.v;
/*  89 */     float f3 = this.b.u;
/*     */     
/*  91 */     if (paramInt == 0 || paramInt == 2) {
/*  92 */       f3 = 0.5F;
/*     */     } else {
/*  94 */       f1 = 0.5F;
/*     */     } 
/*     */     
/*  97 */     f1 /= 32.0F;
/*  98 */     f2 /= 32.0F;
/*  99 */     f3 /= 32.0F;
/*     */     
/* 101 */     float f4 = this.ad + 0.5F;
/* 102 */     float f5 = this.ae + 0.5F;
/* 103 */     float f6 = this.af + 0.5F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     float f7 = 0.5625F;
/*     */     
/* 111 */     if (paramInt == 0) f6 -= f7; 
/* 112 */     if (paramInt == 1) f4 -= f7; 
/* 113 */     if (paramInt == 2) f6 += f7; 
/* 114 */     if (paramInt == 3) f4 += f7;
/*     */     
/* 116 */     if (paramInt == 0) f4 -= c(this.b.u); 
/* 117 */     if (paramInt == 1) f6 += c(this.b.u); 
/* 118 */     if (paramInt == 2) f4 += c(this.b.u); 
/* 119 */     if (paramInt == 3) f6 -= c(this.b.u); 
/* 120 */     f5 += c(this.b.v);
/*     */     
/* 122 */     a(f4, f5, f6);
/*     */     
/* 124 */     float f8 = -0.00625F;
/* 125 */     this.u.c((f4 - f1 - f8), (f5 - f2 - f8), (f6 - f3 - f8), (f4 + f1 + f8), (f5 + f2 + f8), (f6 + f3 + f8));
/*     */   }
/*     */   
/*     */   private float c(int paramInt) {
/* 129 */     if (paramInt == 32) return 0.5F; 
/* 130 */     if (paramInt == 64) return 0.5F; 
/* 131 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void b_() {
/* 135 */     if (this.ac++ == 100 && !b()) {
/* 136 */       this.ac = 0;
/* 137 */       i();
/* 138 */       this.g.a(new fa(this.g, this.k, this.l, this.m, new gc(en.aq)));
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 143 */     if (this.g.a(this, this.u).size() > 0) {
/* 144 */       return false;
/*     */     }
/* 146 */     int i = this.b.u / 16;
/* 147 */     int j = this.b.v / 16;
/*     */     
/* 149 */     int k = this.ad;
/* 150 */     int m = this.ae;
/* 151 */     int n = this.af;
/* 152 */     if (this.a == 0) k = fw.b(this.k - (this.b.u / 32.0F)); 
/* 153 */     if (this.a == 1) n = fw.b(this.m - (this.b.u / 32.0F)); 
/* 154 */     if (this.a == 2) k = fw.b(this.k - (this.b.u / 32.0F)); 
/* 155 */     if (this.a == 3) n = fw.b(this.m - (this.b.u / 32.0F)); 
/* 156 */     m = fw.b(this.l - (this.b.v / 32.0F));
/*     */ 
/*     */     
/* 159 */     for (byte b1 = 0; b1 < i; b1++) {
/* 160 */       for (byte b = 0; b < j; b++) {
/*     */         hz hz;
/* 162 */         if (this.a == 0 || this.a == 2) {
/* 163 */           hz = this.g.c(k + b1, m + b, this.af);
/*     */         } else {
/* 165 */           hz = this.g.c(this.ad, m + b, n + b1);
/*     */         } 
/* 167 */         if (!hz.a()) return false; 
/*     */       } 
/* 169 */     }  List list = this.g.b(this, this.u);
/* 170 */     for (byte b2 = 0; b2 < list.size(); b2++) {
/* 171 */       if (list.get(b2) instanceof bp) return false;
/*     */     
/*     */     } 
/* 174 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c_() {
/* 178 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(db paramdb, int paramInt) {
/* 182 */     i();
/* 183 */     this.g.a(new fa(this.g, this.k, this.l, this.m, new gc(en.aq)));
/* 184 */     return true;
/*     */   }
/*     */   
/*     */   public void a(r paramr) {
/* 188 */     paramr.a("Dir", (byte)this.a);
/* 189 */     paramr.a("Motive", this.b.t);
/* 190 */     paramr.a("TileX", this.ad);
/* 191 */     paramr.a("TileY", this.ae);
/* 192 */     paramr.a("TileZ", this.af);
/*     */   }
/*     */   
/*     */   public void b(r paramr) {
/* 196 */     this.a = paramr.b("Dir");
/* 197 */     this.ad = paramr.d("TileX");
/* 198 */     this.ae = paramr.d("TileY");
/* 199 */     this.af = paramr.d("TileZ");
/* 200 */     String str = paramr.h("Motive");
/* 201 */     for (fx fx1 : fx.values()) {
/* 202 */       if (fx1.t.equals(str)) {
/* 203 */         this.b = fx1;
/*     */       }
/*     */     } 
/* 206 */     if (this.b == null) this.b = fx.a; 
/* 207 */     a(this.a);
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\bp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */