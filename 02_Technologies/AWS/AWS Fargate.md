---
category: AWS_Architecture
source: TechStock_SAA
tags:
  - aws
  - architecture
  - certification
created: 2026-02-24
---

## 1. 一言で言うと？
サーバーを用意せずにコンテナを実行できるマネージド基盤。

## 2. 特性
[[AWS Lambda]]のような最大実行時間制限がなく、長時間のコンテナ処理をマネージド実行できるサーバーレス環境。
[[Amazon EC2]]のスポットインスタンスのようなAWSの都合によるキャパシティ回収を前提にしない。そのため、ステートフルで中断が許容されないジョブに対して要件適合性が高い実行基盤を提供する。


## 3.他機能との対比
