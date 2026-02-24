---
category: AWS_Architecture
source: TechStock_SAA
tags:
  - aws
  - architecture
  - certification
created: 2026-02-11
---

## 1. 一言で言うと？

## 2. 特性
- インターフェイスVPCエンドポイント：[[AWS PrivateLink]]を利用し、VPC内にプライベートアドレスを持つENI(Elastic Network Interface)を作成する。これを作成するとVPC内からAPIGateway のエンドポイントの通信はこのENIを経由し、AWSネットワーク内でプライベートに完結するようになる。
- X-API-Keyヘッダー：APIの利用者を識別・制御する認可の仕組み。

## 3.他機能との対比
