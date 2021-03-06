package com.github.alexthe666.iat.client.model.entity;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelBase;
import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.ilexiconn.llibrary.common.animation.Animator;
import net.ilexiconn.llibrary.common.animation.IAnimated;
import net.minecraft.entity.Entity;

import com.github.alexthe666.iat.client.model.ModelUtils;
import com.github.alexthe666.iat.entity.mob.EntityAnomalocaris;

public class ModelAnomalocaris extends MowzieModelBase {
	public MowzieModelRenderer body1;
	public MowzieModelRenderer body2;
	public MowzieModelRenderer rightFin8;
	public MowzieModelRenderer leftFin8;
	public MowzieModelRenderer rightFin7;
	public MowzieModelRenderer leftFin7;
	public MowzieModelRenderer frontBody;
	public MowzieModelRenderer body3;
	public MowzieModelRenderer leftFin9;
	public MowzieModelRenderer body4;
	public MowzieModelRenderer leftFin12;
	public MowzieModelRenderer leftFin11;
	public MowzieModelRenderer rightFin11;
	public MowzieModelRenderer rightFin10;
	public MowzieModelRenderer leftFin10;
	public MowzieModelRenderer tailFinRight1;
	public MowzieModelRenderer tailFinRight2;
	public MowzieModelRenderer tailFinLeft2;
	public MowzieModelRenderer tailFinLeft1;
	public MowzieModelRenderer rightFin9;
	public MowzieModelRenderer leftTail1;
	public MowzieModelRenderer rightTail1;
	public MowzieModelRenderer rightFin12;
	public MowzieModelRenderer leftTail2;
	public MowzieModelRenderer leftTail3;
	public MowzieModelRenderer leftTail4;
	public MowzieModelRenderer rightTail2;
	public MowzieModelRenderer rightTail3;
	public MowzieModelRenderer rightTail4;
	public MowzieModelRenderer leftFin6;
	public MowzieModelRenderer rightFin6;
	public MowzieModelRenderer rightFin5;
	public MowzieModelRenderer leftFin5;
	public MowzieModelRenderer rightFin4;
	public MowzieModelRenderer leftFin4;
	public MowzieModelRenderer neck1;
	public MowzieModelRenderer rightFin3;
	public MowzieModelRenderer leftFin3;
	public MowzieModelRenderer rightFin2;
	public MowzieModelRenderer leftFin2;
	public MowzieModelRenderer neck2;
	public MowzieModelRenderer rightFin1;
	public MowzieModelRenderer leftFin1;
	public MowzieModelRenderer head;
	public MowzieModelRenderer mouth;
	public MowzieModelRenderer leftEye;
	public MowzieModelRenderer rightEye;
	public MowzieModelRenderer rightArm1;
	public MowzieModelRenderer leftArm1;
	public MowzieModelRenderer rightArm2;
	public MowzieModelRenderer rightArm3;
	public MowzieModelRenderer leftArm2;
	public MowzieModelRenderer leftArm3;
	private Animator animator;

	public ModelAnomalocaris() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.rightTail1 = new MowzieModelRenderer(this, 0, 35);
		this.rightTail1.setRotationPoint(-1.0F, 0.5F, 2.0F);
		this.rightTail1.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.leftFin10 = new MowzieModelRenderer(this, 1, 28);
		this.leftFin10.setRotationPoint(1.5F, 0.5F, -1.0F);
		this.leftFin10.addBox(0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
		this.setRotateAngle(leftFin10, 0.15707963267948966F, 0.0F, 0.0F);
		this.tailFinRight2 = new MowzieModelRenderer(this, -6, 33);
		this.tailFinRight2.setRotationPoint(0.0F, 0.5F, 1.0F);
		this.tailFinRight2.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 6, 0.0F);
		this.setRotateAngle(tailFinRight2, 0.4363323129985824F, -0.4363323129985824F, 0.0F);
		this.frontBody = new MowzieModelRenderer(this, 38, 0);
		this.frontBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.frontBody.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
		this.neck1 = new MowzieModelRenderer(this, 26, 0);
		this.neck1.setRotationPoint(0.0F, 0.0F, -5.0F);
		this.neck1.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 2, 0.0F);
		this.rightFin1 = new MowzieModelRenderer(this, 12, 13);
		this.rightFin1.setRotationPoint(-1.0F, 0.5F, -1.0F);
		this.rightFin1.addBox(-3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F);
		this.setRotateAngle(rightFin1, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftTail4 = new MowzieModelRenderer(this, 0, 38);
		this.leftTail4.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.leftTail4.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.rightFin4 = new MowzieModelRenderer(this, 10, 16);
		this.rightFin4.setRotationPoint(-2.0F, 0.5F, -5.0F);
		this.rightFin4.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F);
		this.setRotateAngle(rightFin4, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightArm1 = new MowzieModelRenderer(this, 0, 9);
		this.rightArm1.setRotationPoint(-1.5F, 0.14F, -3.99F);
		this.rightArm1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightArm1, -0.8726646259971648F, 0.0F, 0.0F);
		this.leftArm1 = new MowzieModelRenderer(this, 0, 9);
		this.leftArm1.setRotationPoint(0.5F, 0.14F, -3.99F);
		this.leftArm1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftArm1, -0.8726646259971648F, 0.0F, 0.0F);
		this.rightTail4 = new MowzieModelRenderer(this, 0, 38);
		this.rightTail4.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.rightTail4.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.leftFin2 = new MowzieModelRenderer(this, 1, 14);
		this.leftFin2.setRotationPoint(1.0F, 0.5F, -2.0F);
		this.leftFin2.addBox(0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F);
		this.setRotateAngle(leftFin2, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftFin1 = new MowzieModelRenderer(this, 2, 13);
		this.leftFin1.setRotationPoint(1.0F, 0.5F, -1.0F);
		this.leftFin1.addBox(0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F);
		this.setRotateAngle(leftFin1, 0.15707963267948966F, 0.0F, 0.0F);
		this.tailFinLeft2 = new MowzieModelRenderer(this, -6, 33);
		this.tailFinLeft2.setRotationPoint(0.0F, 0.5F, 1.0F);
		this.tailFinLeft2.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 6, 0.0F);
		this.setRotateAngle(tailFinLeft2, 0.4363323129985824F, 0.4363323129985824F, 0.0F);
		this.body1 = new MowzieModelRenderer(this, 38, 7);
		this.body1.setRotationPoint(0.0F, 20.0F, 0.0F);
		this.body1.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 5, 0.0F);
		this.leftTail3 = new MowzieModelRenderer(this, 0, 37);
		this.leftTail3.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.leftTail3.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.leftEye = new MowzieModelRenderer(this, 4, 6);
		this.leftEye.setRotationPoint(1.0F, 0.26F, -2.22F);
		this.leftEye.addBox(0.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftEye, 0.5134758659367318F, 0.22165681500327983F, 0.6677629718130305F);
		this.leftArm2 = new MowzieModelRenderer(this, 0, 9);
		this.leftArm2.setRotationPoint(0.0F, 1.97F, -0.02F);
		this.leftArm2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftArm2, 0.4886921905584123F, 0.0F, 0.0F);
		this.leftFin8 = new MowzieModelRenderer(this, 1, 24);
		this.leftFin8.setRotationPoint(2.5F, 0.5F, 3.0F);
		this.leftFin8.addBox(0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
		this.setRotateAngle(leftFin8, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightFin6 = new MowzieModelRenderer(this, 9, 20);
		this.rightFin6.setRotationPoint(-1.7F, 0.5F, -1.0F);
		this.rightFin6.addBox(-5.0F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
		this.setRotateAngle(rightFin6, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightFin12 = new MowzieModelRenderer(this, 13, 31);
		this.rightFin12.setRotationPoint(-1.97F, -0.42F, -0.98F);
		this.rightFin12.addBox(-2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
		this.setRotateAngle(rightFin12, -0.3209660494417572F, 0.5562364326105927F, -0.26703537555513246F);
		this.leftFin6 = new MowzieModelRenderer(this, -1, 20);
		this.leftFin6.setRotationPoint(1.7F, 0.5F, -1.0F);
		this.leftFin6.addBox(0.0F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
		this.setRotateAngle(leftFin6, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightEye = new MowzieModelRenderer(this, 0, 6);
		this.rightEye.setRotationPoint(-1.0F, 0.26F, -2.22F);
		this.rightEye.addBox(-1.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightEye, 0.5134758659367318F, -0.22165681500327983F, -0.6677629718130305F);
		this.rightTail3 = new MowzieModelRenderer(this, 0, 37);
		this.rightTail3.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.rightTail3.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.neck2 = new MowzieModelRenderer(this, 16, 0);
		this.neck2.setRotationPoint(0.0F, 0.0F, -2.0F);
		this.neck2.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
		this.leftFin9 = new MowzieModelRenderer(this, 1, 26);//TODO
		this.leftFin9.setRotationPoint(2.0F, 0.5F, 0.0F);
		this.leftFin9.addBox(0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
		this.setRotateAngle(leftFin9, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftFin7 = new MowzieModelRenderer(this, 0, 22);
		this.leftFin7.setRotationPoint(2.3F, 0.5F, 1.0F);
		this.leftFin7.addBox(0.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F);
		this.setRotateAngle(leftFin7, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightFin10 = new MowzieModelRenderer(this, 11, 28);
		this.rightFin10.setRotationPoint(-1.5F, 0.5F, -1.0F);
		this.rightFin10.addBox(-3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
		this.setRotateAngle(rightFin10, 0.15707963267948966F, 0.0F, 0.0F);
		this.body4 = new MowzieModelRenderer(this, 38, 24);
		this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
		this.body4.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.rightFin7 = new MowzieModelRenderer(this, 10, 22);
		this.rightFin7.setRotationPoint(-2.3F, 0.5F, 1.0F);
		this.rightFin7.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F);
		this.setRotateAngle(rightFin7, 0.15707963267948966F, 0.0F, 0.0F);
		this.head = new MowzieModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
		this.head.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(head, 0.3490658503988659F, -0.0F, 0.0F);
		this.rightTail2 = new MowzieModelRenderer(this, 0, 36);
		this.rightTail2.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.rightTail2.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.tailFinLeft1 = new MowzieModelRenderer(this, -1, 33);
		this.tailFinLeft1.setRotationPoint(0.0F, 0.5F, 1.0F);
		this.tailFinLeft1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 5, 0.0F);
		this.setRotateAngle(tailFinLeft1, 0.40142572795869574F, 0.6108652381980153F, 0.0F);
		this.leftFin4 = new MowzieModelRenderer(this, 0, 16);
		this.leftFin4.setRotationPoint(2.0F, 0.5F, -5.0F);
		this.leftFin4.addBox(0.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F);
		this.setRotateAngle(leftFin4, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightArm2 = new MowzieModelRenderer(this, 0, 9);
		this.rightArm2.setRotationPoint(0.0F, 1.97F, -0.02F);
		this.rightArm2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightArm2, 0.4886921905584123F, 0.0F, 0.0F);
		this.body2 = new MowzieModelRenderer(this, 38, 14);
		this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
		this.body2.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
		this.body3 = new MowzieModelRenderer(this, 38, 19);
		this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
		this.body3.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
		this.rightFin3 = new MowzieModelRenderer(this, 11, 15);
		this.rightFin3.setRotationPoint(-1.5F, 0.5F, -1.0F);
		this.rightFin3.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F);
		this.setRotateAngle(rightFin3, 0.15707963267948966F, 0.0F, 0.0F);
		this.tailFinRight1 = new MowzieModelRenderer(this, -1, 33);
		this.tailFinRight1.setRotationPoint(0.0F, 0.5F, 1.0F);
		this.tailFinRight1.addBox(-1.0F, 0.0F, 0.0F, 1, 0, 5, 0.0F);
		this.setRotateAngle(tailFinRight1, 0.40142572795869574F, -0.6108652381980153F, 0.0F);
		this.rightFin9 = new MowzieModelRenderer(this, 11, 26);
		this.rightFin9.setRotationPoint(-2.0F, 0.5F, 0.0F);//TODO
		this.rightFin9.addBox(-3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
		this.setRotateAngle(rightFin9, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftFin3 = new MowzieModelRenderer(this, 1, 15);
		this.leftFin3.setRotationPoint(1.5F, 0.5F, -1.0F);
		this.leftFin3.addBox(0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F);
		this.setRotateAngle(leftFin3, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftFin12 = new MowzieModelRenderer(this, 3, 31);
		this.leftFin12.setRotationPoint(1.0F, 0.5F, 2.0F);
		this.leftFin12.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
		this.setRotateAngle(leftFin12, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftArm3 = new MowzieModelRenderer(this, 0, 9);
		this.leftArm3.setRotationPoint(0.0F, 2.0F, -0.0F);
		this.leftArm3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftArm3, 0.9250245035569946F, 0.0F, 0.0F);
		this.leftTail1 = new MowzieModelRenderer(this, 0, 35);
		this.leftTail1.setRotationPoint(1.0F, 0.5F, 2.0F);
		this.leftTail1.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.rightFin8 = new MowzieModelRenderer(this, 11, 24);
		this.rightFin8.setRotationPoint(-2.5F, 0.5F, 3.0F);
		this.rightFin8.addBox(-3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
		this.setRotateAngle(rightFin8, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightFin11 = new MowzieModelRenderer(this, 13, 30);
		this.rightFin11.setRotationPoint(-1.5F, 0.5F, 1.0F);
		this.rightFin11.addBox(-2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
		this.setRotateAngle(rightFin11, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftFin5 = new MowzieModelRenderer(this, 0, 18);
		this.leftFin5.setRotationPoint(2.5F, 0.5F, -3.0F);
		this.leftFin5.addBox(0.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F);
		this.setRotateAngle(leftFin5, 0.15707963267948966F, 0.0F, 0.0F);
		this.leftFin11 = new MowzieModelRenderer(this, 3, 30);
		this.leftFin11.setRotationPoint(1.5F, 0.5F, 1.0F);
		this.leftFin11.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
		this.setRotateAngle(leftFin11, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightFin5 = new MowzieModelRenderer(this, 10, 18);
		this.rightFin5.setRotationPoint(-2.5F, 0.5F, -3.0F);
		this.rightFin5.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F);
		this.setRotateAngle(rightFin5, 0.15707963267948966F, 0.0F, 0.0F);
		this.rightArm3 = new MowzieModelRenderer(this, 0, 9);
		this.rightArm3.setRotationPoint(0.0F, 2.0F, -0.0F);
		this.rightArm3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightArm3, 0.9250245035569946F, 0.0F, 0.0F);
		this.rightFin2 = new MowzieModelRenderer(this, 11, 14);
		this.rightFin2.setRotationPoint(-1.0F, 0.5F, -2.0F);
		this.rightFin2.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F);
		this.setRotateAngle(rightFin2, 0.15707963267948966F, 0.0F, 0.0F);
		this.mouth = new MowzieModelRenderer(this, 8, 6);
		this.mouth.setRotationPoint(0.0F, 1.24F, -0.98F);
		this.mouth.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
		this.leftTail2 = new MowzieModelRenderer(this, 0, 36);
		this.leftTail2.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.leftTail2.addBox(0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F);
		this.leftTail1.addChild(this.leftTail2);
		this.body4.addChild(this.rightTail1);
		this.body3.addChild(this.leftFin10);
		this.body4.addChild(this.tailFinRight2);
		this.body1.addChild(this.frontBody);
		this.frontBody.addChild(this.neck1);
		this.neck2.addChild(this.rightFin1);
		this.leftTail3.addChild(this.leftTail4);
		this.frontBody.addChild(this.rightFin4);
		this.head.addChild(this.rightArm1);
		this.head.addChild(this.leftArm1);
		this.rightTail3.addChild(this.rightTail4);
		this.neck1.addChild(this.leftFin2);
		this.neck2.addChild(this.leftFin1);
		this.body4.addChild(this.tailFinLeft2);
		this.leftTail2.addChild(this.leftTail3);
		this.head.addChild(this.leftEye);
		this.leftArm1.addChild(this.leftArm2);
		this.body1.addChild(this.leftFin8);
		this.frontBody.addChild(this.rightFin6);
		this.tailFinRight1.addChild(this.rightFin12);
		this.frontBody.addChild(this.leftFin6);
		this.head.addChild(this.rightEye);
		this.rightTail2.addChild(this.rightTail3);
		this.neck1.addChild(this.neck2);
		this.body2.addChild(this.leftFin9);
		this.body1.addChild(this.leftFin7);
		this.body3.addChild(this.rightFin10);
		this.body3.addChild(this.body4);
		this.body1.addChild(this.rightFin7);
		this.neck2.addChild(this.head);
		this.rightTail1.addChild(this.rightTail2);
		this.body4.addChild(this.tailFinLeft1);
		this.frontBody.addChild(this.leftFin4);
		this.rightArm1.addChild(this.rightArm2);
		this.body1.addChild(this.body2);
		this.body2.addChild(this.body3);
		this.neck1.addChild(this.rightFin3);
		this.body4.addChild(this.tailFinRight1);
		this.body2.addChild(this.rightFin9);
		this.neck1.addChild(this.leftFin3);
		this.body3.addChild(this.leftFin12);
		this.leftArm2.addChild(this.leftArm3);
		this.body4.addChild(this.leftTail1);
		this.body1.addChild(this.rightFin8);
		this.body3.addChild(this.rightFin11);
		this.frontBody.addChild(this.leftFin5);
		this.body3.addChild(this.leftFin11);
		this.frontBody.addChild(this.rightFin5);
		this.rightArm2.addChild(this.rightArm3);
		this.neck1.addChild(this.rightFin2);
		this.head.addChild(this.mouth);
		animator = new Animator(this);
		ModelUtils.doMowzieStuff(boxList, false);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		animate((IAnimated)entity, f, f1, f2, f3, f4, f5);
		ModelUtils.renderAll(boxList);
	}

	private void animate(IAnimated entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animator.update(entity);
		setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
		
		animator.setAnimationId(1);
		animator.startPhase(30);
		ModelUtils.rotate(animator, neck1, 0F, 5F, 5F);
		ModelUtils.rotate(animator, neck2, 0F, 10F, 5F);
		ModelUtils.rotate(animator, head, 0F, 20F, -5F);
		animator.endPhase();		
		animator.startPhase(30);
		ModelUtils.rotate(animator, neck1, 0F, 0F, 0F);
		ModelUtils.rotate(animator, neck2, 0F, 0F, 0F);
		ModelUtils.rotate(animator, head, 0F, 0F, 0F);
		ModelUtils.rotate(animator, neck1, 0F, -5F, -5F);
		ModelUtils.rotate(animator, neck2, 0F, -10F, -5F);
		ModelUtils.rotate(animator, head, 0F, -20F, 5F);
		animator.endPhase();
		animator.resetPhase(10);
		animator.endPhase();
		
		animator.setAnimationId(2);
		animator.startPhase(30);
		ModelUtils.rotate(animator, rightArm1, -70F, 0F, 0F);
		ModelUtils.rotate(animator, rightArm2, 20F, 0F, 0F);
		ModelUtils.rotate(animator, rightArm3, -14F, 0F, 0F);
		animator.endPhase();
		animator.startPhase(30);
		ModelUtils.rotate(animator, leftArm1, 0F, 0F, 0F);
		ModelUtils.rotate(animator, leftArm2, 0F, 0F, 0F);
		ModelUtils.rotate(animator, leftArm3, 0F, 0F, 0F);
		ModelUtils.rotate(animator, leftArm1, -70F, 0F, 0F);
		ModelUtils.rotate(animator, leftArm2, 20F, 0F, 0F);
		ModelUtils.rotate(animator, leftArm3, -14F, 0F, 0F);
		animator.endPhase();
		animator.resetPhase(10);
		animator.endPhase();
		
		EntityAnomalocaris mob = ((EntityAnomalocaris)animator.getEntity());
		if(mob.getAnimation() == EntityAnomalocaris.animation_shakehead && mob.getAnimationTick() >= 0 && mob.getAnimationTick() <= 78){
			//this.flap(head, 0.4F, 0.1F, false, 0, 0, ((Entity)entity).ticksExisted, 1);
			float globalSpeed = 0.3F;
			this.walk(rightArm1, globalSpeed, 0.3F, false, -0.3F, 0, mob.ticksExisted, 1);
			this.walk(rightArm2, globalSpeed, 0.2F, false, 0, 0, mob.ticksExisted, 1);
			this.walk(rightArm3, globalSpeed, 0.2F, false, 0, 0, mob.ticksExisted, 1);
			this.walk(leftArm1, globalSpeed, 0.3F, true, -0.3F, 0, mob.ticksExisted, 1);
			this.walk(leftArm2, globalSpeed, 0.2F, true, 0, 0, mob.ticksExisted, 1);
			this.walk(leftArm3, globalSpeed, 0.2F, true, 0, 0, mob.ticksExisted, 1);
		}else{
			this.faceTarget(neck1, 3, f3, f4);
			this.faceTarget(neck2, 3, f3, f4);
			this.faceTarget(head, 3, f3, f4);
		}
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		ModelUtils.doMowzieStuff(boxList, true);
		float globalSpeed = 0.3F;
		MowzieModelRenderer[] rightTailParts = {this.rightTail1, this.rightTail2, this.rightTail3, this.rightTail4};
		MowzieModelRenderer[] leftTailParts = {this.leftTail1, this.leftTail2, this.leftTail3, this.leftTail4};
		MowzieModelRenderer[] lowerBodyParts = {this.body1, this.body2, this.body3, this.body4};
		MowzieModelRenderer[] leftUpperFins = {this.leftFin6, this.leftFin5, this.leftFin4, this.leftFin3, this.leftFin2, this.leftFin1};
		MowzieModelRenderer[] leftLowerFins = {this.leftFin7, this.leftFin8, this.leftFin9, this.leftFin10, this.leftFin11, this.leftFin12};
		MowzieModelRenderer[] rightUpperFins = {this.rightFin6, this.rightFin5, this.rightFin4, this.rightFin3, this.rightFin2, this.rightFin1};
		MowzieModelRenderer[] rightLowerFins = {this.rightFin7, this.rightFin8, this.rightFin9, this.rightFin10, this.rightFin11, this.rightFin12};
		MowzieModelRenderer[] neck = {this.neck2, this.neck1, this.head};
		//this.faceTarget(neck1, 3, f3, f4);
		//this.faceTarget(neck2, 3, f3, f4);
		//this.faceTarget(head, 3, f3, f4);
		this.chainFlap(leftUpperFins, globalSpeed, 0.3F, 3, entity.ticksExisted, 1);
		this.chainFlap(leftLowerFins, globalSpeed, 0.3F, 3, entity.ticksExisted, 1);
		this.chainFlap(rightUpperFins, globalSpeed, -0.3F, 3, entity.ticksExisted, 1);
		this.chainFlap(rightLowerFins, globalSpeed, -0.3F, 3, entity.ticksExisted, 1);
		((EntityAnomalocaris)entity).tailbuffer.applyChainSwingBuffer(rightTailParts);
		((EntityAnomalocaris)entity).tailbuffer.applyChainSwingBuffer(leftTailParts);
		((EntityAnomalocaris)entity).bodybuffer.applyChainSwingBuffer(lowerBodyParts);
		((EntityAnomalocaris)entity).tailbuffer.applyChainWaveBuffer(rightTailParts);
		((EntityAnomalocaris)entity).tailbuffer.applyChainWaveBuffer(leftTailParts);
		((EntityAnomalocaris)entity).bodybuffer.applyChainWaveBuffer(lowerBodyParts);
		if(((EntityAnomalocaris)entity).riddenByEntity != null){
			this.walk(rightArm1, globalSpeed, 0.3F, false, -0.3F, 0, entity.ticksExisted, 1);
			this.walk(rightArm2, globalSpeed, 0.2F, false, 0, 0, entity.ticksExisted, 1);
			this.walk(rightArm3, globalSpeed, 0.2F, false, 0, 0, entity.ticksExisted, 1);
			this.walk(leftArm1, globalSpeed, 0.3F, true, -0.3F, 0, entity.ticksExisted, 1);
			this.walk(leftArm2, globalSpeed, 0.2F, true, 0, 0, entity.ticksExisted, 1);
			this.walk(leftArm3, globalSpeed, 0.2F, true, 0, 0, entity.ticksExisted, 1);
			this.chainSwing(neck, globalSpeed, 0.2F, 2, entity.ticksExisted, 1);
		}
	}

	public void setRotateAngle(MowzieModelRenderer MowzieModelRenderer, float x, float y, float z) {
		MowzieModelRenderer.rotateAngleX = x;
		MowzieModelRenderer.rotateAngleY = y;
		MowzieModelRenderer.rotateAngleZ = z;
	}
}
