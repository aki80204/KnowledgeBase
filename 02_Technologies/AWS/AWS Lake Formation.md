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
データレイクの構築、保護、管理を簡素化するフルマネージドサービス。データ取り込みからアクセス制御までを[[Data Catalog]]を中心に統合できる。

## 2. 特性
サービスの中核は[[AWS Glue Data Catalog]]上のテーブルに対する[[Fine-Grained Access Control(FGAC)]]で特定のユーザーや[[AWS Identity and Access Management]]ロールに対して、テーブル内の特例の列のみを許可する列レベル権限を付与することができる。

## 3.他機能との対比
