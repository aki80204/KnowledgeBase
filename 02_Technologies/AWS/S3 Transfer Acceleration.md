---
category: AWS_Architecture
source: TechStock_SAA
tags:
  - aws
  - architecture
  - certification
created: 2026-02-18
---

## 1. 一言で言うと？
AWSのエッジロケーションを経由して、クライアントと[[Amazon S3]]の間での通信経路を最適化し、長距離の転送(アップロード/ダウンロードの両方)を高速化できる機能。

## 2. 特性
[[Amazon S3]]への到達経路を最適化することができるが、追加料金がかかる。

## 3.他機能との対比
あくまでも「[[Amazon S3]]への到達経路を最適化する」仕組みのため、[[Amazon CloudFront]]のようにオブジェクトをエッジにキャッシュして繰り返しの配信をオリジンから切り離すことはできない。