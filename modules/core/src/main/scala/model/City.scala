// Copyright (c) 2018 by Rob Norris
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package model

final case class City(
  id:           Int,
  name:         String,
  countryId:    String,
  district:     String,
  population:   Int,
)
