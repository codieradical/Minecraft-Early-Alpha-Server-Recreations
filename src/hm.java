/*     */ import java.util.Random;
/*     */ import java.util.logging.Logger;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class hm
/*     */   extends dy
/*     */ {
/*  19 */   public static Logger a = Logger.getLogger("Minecraft");
/*     */   
/*     */   public aw b;
/*     */   public boolean c = false;
/*     */   private MinecraftServer d;
/*     */   private dq e;
/*  25 */   private int f = 0;
/*     */   
/*     */   private double g;
/*     */   
/*     */   private double h;
/*     */   
/*     */   private double i;
/*     */   
/*     */   private boolean j;
/*     */   
/*     */   public void a() {
/*  36 */     this.b.a();
/*  37 */     if (this.f++ % 20 == 0) {
/*  38 */       this.b.a(new ii());
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*  43 */     this.b.a(new hx(paramString));
/*  44 */     this.b.c();
/*  45 */     this.d.f.c(this.e);
/*  46 */     this.c = true;
/*     */   }
/*     */   
/*     */   public hm(MinecraftServer paramMinecraftServer, aw paramaw, dq paramdq) {
/*  50 */     this.j = true; this.d = paramMinecraftServer; this.b = paramaw;
/*     */     paramaw.a(this);
/*     */     this.e = paramdq;
/*  53 */     paramdq.a = this; } public void a(fs paramfs) { if (!this.j) {
/*  54 */       double d = paramfs.b - this.h;
/*  55 */       if (paramfs.a == this.g && d * d < 0.01D && paramfs.c == this.i) {
/*  56 */         this.j = true;
/*     */       }
/*     */     } 
/*  59 */     if (this.j) {
/*  60 */       this.g = this.e.k;
/*  61 */       this.h = this.e.l;
/*  62 */       this.i = this.e.m;
/*     */ 
/*     */       
/*  65 */       double d1 = this.e.k;
/*  66 */       double d2 = this.e.l;
/*  67 */       double d3 = this.e.m;
/*     */       
/*  69 */       float f1 = this.e.q;
/*  70 */       float f2 = this.e.r;
/*     */       
/*  72 */       if (paramfs.h) {
/*  73 */         d1 = paramfs.a;
/*  74 */         d2 = paramfs.b;
/*  75 */         d3 = paramfs.c;
/*  76 */         double d = paramfs.d - paramfs.b;
/*  77 */         if (d > 1.65D || d < 0.1D) {
/*  78 */           b("Illegal stance");
/*  79 */           a.warning(this.e.ap + " had an illegal stance: " + d);
/*     */         } 
/*  81 */         this.e.ah = paramfs.d;
/*     */       } 
/*  83 */       if (paramfs.i) {
/*  84 */         f1 = paramfs.e;
/*  85 */         f2 = paramfs.f;
/*     */       } 
/*     */       
/*  88 */       this.e.h();
/*  89 */       this.e.L = 0.0F;
/*  90 */       this.e.b(this.g, this.h, this.i, f1, f2);
/*     */       
/*  92 */       double d4 = d1 - this.e.k;
/*  93 */       double d5 = d2 - this.e.l;
/*  94 */       double d6 = d3 - this.e.m;
/*     */       
/*  96 */       float f3 = 0.0625F;
/*  97 */       boolean bool1 = (this.d.e.a(this.e, this.e.u.b().e(f3, f3, f3)).size() == 0) ? true : false;
/*     */       
/*  99 */       this.e.c(d4, d5, d6);
/* 100 */       d4 = d1 - this.e.k;
/* 101 */       d5 = d2 - this.e.l;
/* 102 */       if (d5 > -0.5D || d5 < 0.5D) {
/* 103 */         d5 = 0.0D;
/*     */       }
/* 105 */       d6 = d3 - this.e.m;
/* 106 */       double d7 = d4 * d4 + d5 * d5 + d6 * d6;
/* 107 */       boolean bool2 = false;
/* 108 */       if (d7 > 0.0625D) {
/* 109 */         bool2 = true;
/* 110 */         a.warning(this.e.ap + " moved wrongly!");
/*     */       } 
/* 112 */       this.e.b(d1, d2, d3, f1, f2);
/*     */       
/* 114 */       boolean bool3 = (this.d.e.a(this.e, this.e.u.b().e(f3, f3, f3)).size() == 0) ? true : false;
/* 115 */       if (bool1 && (bool2 || !bool3)) {
/* 116 */         a(this.g, this.h, this.i, f1, f2);
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 121 */       this.e.v = paramfs.g;
/* 122 */       this.d.f.b(this.e);
/*     */     }  }
/*     */ 
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 127 */     this.j = false;
/* 128 */     this.g = paramDouble1;
/* 129 */     this.h = paramDouble2;
/* 130 */     this.i = paramDouble3;
/* 131 */     this.e.b(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 132 */     this.e.a.b(new dh(paramDouble1, paramDouble2 + 1.6200000047683716D, paramDouble2, paramDouble3, paramFloat1, paramFloat2, false));
/*     */   }
/*     */   
/*     */   public void a(gp paramgp) {
/* 136 */     boolean bool = false;
/* 137 */     if (paramgp.e == 0) bool = true; 
/* 138 */     if (paramgp.e == 1) bool = true;
/*     */     
/* 140 */     if (bool) {
/* 141 */       double d = this.e.l;
/* 142 */       this.e.l = this.e.ah;
/* 143 */       fe fe = this.e.a(4.0D, 1.0F);
/* 144 */       this.e.l = d;
/* 145 */       if (fe == null) {
/* 146 */         System.out.println("MISMATCH: Got " + paramgp.a + ", " + paramgp.b + ", " + paramgp.c + ", " + paramgp.d + ", but expected <NO HIT>"); return;
/*     */       } 
/* 148 */       if (fe.b != paramgp.a || fe.c != paramgp.b || fe.d != paramgp.c || fe.e != paramgp.d) {
/* 149 */         System.out.println("MISMATCH: Got " + paramgp.a + ", " + paramgp.b + ", " + paramgp.c + ", " + paramgp.d + ", but expected " + fe.b + ", " + fe.c + ", " + fe.d + ", " + fe.e);
/*     */         return;
/*     */       } 
/*     */     } 
/* 153 */     int i = paramgp.a;
/* 154 */     int j = paramgp.b;
/* 155 */     int k = paramgp.c;
/* 156 */     int m = paramgp.d;
/* 157 */     int n = (int)fw.e((i - this.d.e.l));
/* 158 */     int i1 = (int)fw.e((k - this.d.e.n));
/* 159 */     if (n > i1) i1 = n; 
/* 160 */     if (paramgp.e == 0) {
/* 161 */       if (i1 > 16) this.e.ac.a(i, j, k); 
/* 162 */     } else if (paramgp.e == 2) {
/* 163 */       this.e.ac.a();
/* 164 */     } else if (paramgp.e == 1) {
/* 165 */       if (i1 > 16) this.e.ac.a(i, j, k, m); 
/* 166 */     } else if (paramgp.e == 3) {
/* 167 */       double d1 = this.e.k - i + 0.5D;
/* 168 */       double d2 = this.e.l - j + 0.5D;
/* 169 */       double d3 = this.e.m - k + 0.5D;
/* 170 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 171 */       if (d4 < 256.0D) {
/* 172 */         this.e.a.b(new eh(i, j, k, this.d.e));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(es parames) {
/* 178 */     int i = parames.b;
/* 179 */     int j = parames.c;
/* 180 */     int k = parames.d;
/* 181 */     int m = parames.e;
/* 182 */     int n = (int)fw.e((i - this.d.e.l));
/* 183 */     int i1 = (int)fw.e((k - this.d.e.n));
/* 184 */     if (n > i1) i1 = n; 
/* 185 */     if (i1 > 16) {
/* 186 */       gc gc = new gc(parames.a);
/* 187 */       this.e.ac.a(this.e, this.d.e, gc, i, j, k, m);
/*     */     } 
/* 189 */     this.e.a.b(new eh(i, j, k, this.d.e));
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 193 */     a.info(this.e.ap + " lost connection: " + paramString);
/* 194 */     this.d.f.c(this.e);
/* 195 */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(ha paramha) {
/* 199 */     a.warning(getClass() + " wasn't prepared to deal with a " + paramha.getClass());
/* 200 */     b("Protocol error, unexpected packet");
/*     */   }
/*     */   
/*     */   public void b(ha paramha) {
/* 204 */     this.b.a(paramha);
/*     */   }
/*     */   
/*     */   public void a(fi paramfi) {
/* 208 */     int i = paramfi.b;
/* 209 */     if (i == 0) {
/* 210 */       this.e.ai.a[this.e.ai.d] = null;
/*     */     } else {
/* 212 */       this.e.ai.a[this.e.ai.d] = new gc(i);
/*     */     } 
/* 214 */     this.d.k.a(this.e, new fi(this.e.c, i));
/*     */   }
/*     */   
/*     */   public void a(j paramj) {
/* 218 */     double d1 = paramj.b / 32.0D;
/* 219 */     double d2 = paramj.c / 32.0D;
/* 220 */     double d3 = paramj.d / 32.0D;
/* 221 */     fa fa = new fa(this.d.e, d1, d2, d3, new gc(paramj.h, paramj.i));
/* 222 */     fa.n = paramj.e / 128.0D;
/* 223 */     fa.o = paramj.f / 128.0D;
/* 224 */     fa.p = paramj.g / 128.0D;
/* 225 */     fa.ac = 10;
/* 226 */     this.d.e.a(fa);
/*     */   }
/*     */   
/*     */   public void a(ax paramax) {
/* 230 */     String str = paramax.a;
/* 231 */     if (str.length() > 100) {
/* 232 */       b("Chat message too long");
/*     */       return;
/*     */     } 
/* 235 */     str = str.trim();
/* 236 */     for (byte b = 0; b < str.length(); b++) {
/* 237 */       if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(str.charAt(b)) < 0) {
/* 238 */         b("Illegal characters in chat");
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 243 */     if (str.startsWith("/")) {
/* 244 */       c(str);
/*     */     } else {
/* 246 */       str = "<" + this.e.ap + "> " + str;
/* 247 */       a.info(str);
/* 248 */       this.d.f.a(new ax(str));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(String paramString) {
/* 254 */     if (paramString.toLowerCase().startsWith("/me ")) {
/* 255 */       paramString = "* " + this.e.ap + " " + paramString.substring(paramString.indexOf(" ")).trim();
/* 256 */       a.info(paramString);
/* 257 */       this.d.f.a(new ax(paramString));
/* 258 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/home")) {
/* 259 */       a.info(this.e.ap + " returned home");
/* 260 */       int i = this.d.e.d(this.d.e.l, this.d.e.n);
/* 261 */       a(this.d.e.l + 0.5D, i + 1.5D, this.d.e.n + 0.5D, 0.0F, 0.0F);
/* 262 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/away")) {
/* 263 */       Random random = new Random();
/* 264 */       a.info(this.e.ap + " went away");
/* 265 */       double d1 = Math.random() * 10000.0D - 5000.0D;
/* 266 */       double d2 = Math.random() * 10000.0D - 5000.0D;
/* 267 */       a(d1, 80.0D, d2, random.nextFloat() * 360.0F, 0.0F);
/* 268 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/iron")) {
/* 269 */       if (MinecraftServer.b.containsKey(this.e.ap)) {
/* 270 */         a.info(this.e.ap + " failed to iron!");
/* 271 */         b(new ax("§cYou can't /iron again so soon!"));
/*     */       } else {
/* 273 */         MinecraftServer.b.put(this.e.ap, Integer.valueOf(6000));
/* 274 */         a.info(this.e.ap + " ironed!");
/* 275 */         for (byte b = 0; b < 4; b++) {
/* 276 */           this.e.a(new gc(en.m, 1));
/*     */         }
/*     */       } 
/* 279 */     } else if (paramString.toLowerCase().equalsIgnoreCase("/wood")) {
/* 280 */       if (MinecraftServer.b.containsKey(this.e.ap)) {
/* 281 */         a.info(this.e.ap + " failed to wood!");
/* 282 */         b(new ax("§cYou can't /wood again so soon!"));
/*     */       } else {
/* 284 */         MinecraftServer.b.put(this.e.ap, Integer.valueOf(6000));
/* 285 */         a.info(this.e.ap + " wooded!");
/* 286 */         for (byte b = 0; b < 4; b++) {
/* 287 */           this.e.a(new gc(et.y, 1));
/*     */         }
/*     */       } 
/*     */     } else {
/* 291 */       b(new ax("§9Unknown command"));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(n paramn) {
/* 296 */     if (paramn.b == 1) {
/* 297 */       this.e.y();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(hx paramhx) {
/* 302 */     this.b.a("Quitting");
/*     */   }
/*     */   
/*     */   public int b() {
/* 306 */     return this.b.d();
/*     */   }
/*     */ }


/* Location:              D:\Projects\Local\MinecraftBetaOfflineLauncher\Binaries\Test Server\a0.0.1.jar!\hm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */