package model

case class TrainingModel(feature1: Double,
                         feature2: Option[Double],
                         feature3: Float,
                         feature4: Boolean,
                         feature5: Int,
                         feature6: Option[Boolean],
                         labelDouble: Double,
                         labelInt: Int)
